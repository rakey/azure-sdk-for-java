﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;
using System.Linq;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Java.TemplateModels;
using Microsoft.Rest.Generator.Utilities;
using System.Globalization;
using System.Text;
using System;

namespace Microsoft.Rest.Generator.Java
{
    public class MethodTemplateModel : Method
    {
        private JavaCodeNamer _namer;

        public MethodTemplateModel(Method source, ServiceClient serviceClient)
        {
            this.LoadFrom(source);
            JavaParameters = new List<JavaParameter>();
            JavaLogicalParameters = new List<JavaParameter>();
            source.Parameters.Where(p => p.Location == ParameterLocation.Path).ForEach(p => JavaParameters.Add(new JavaParameter(p)));
            source.Parameters.Where(p => p.Location != ParameterLocation.Path).ForEach(p => JavaParameters.Add(new JavaParameter(p)));
            source.LogicalParameters.ForEach(p => JavaLogicalParameters.Add(new JavaParameter(p)));
            ServiceClient = serviceClient;
            if (source.Group != null)
            {
                OperationName = source.Group.ToPascalCase();
                ClientReference = "this.client";
            }
            else
            {
                OperationName = serviceClient.Name;
                ClientReference = "this";
            }
            _namer = new JavaCodeNamer(serviceClient.Namespace);
        }

        protected virtual JavaCodeNamer Namer
        {
            get
            {
                return _namer;
            }
        }

        public string ClientReference { get; set; }

        public string OperationName { get; set; }

        public ServiceClient ServiceClient { get; set; }

        public List<JavaParameter> JavaParameters { get; private set; }

        public List<JavaParameter> JavaLogicalParameters { get; private set; }

        public IEnumerable<JavaParameter> RetrofitParameters
        {
            get
            {
                return JavaLogicalParameters.Where(p => p.Location != ParameterLocation.None)
                    .Where(p => !p.Extensions.ContainsKey("hostParameter"));
            }
        }

        public IEnumerable<JavaParameter> OrderedRetrofitParameters
        {
            get
            {
                return RetrofitParameters.Where(p => p.Location == ParameterLocation.Path)
                    .Union(RetrofitParameters.Where(p => p.Location != ParameterLocation.Path));
            }
        }

        /// <summary>
        /// Generate the method parameter declarations for a method
        /// </summary>
        public virtual string MethodParameterApiDeclaration
        {
            get
            {
                List<string> declarations = new List<string>();
                foreach (var parameter in OrderedRetrofitParameters)
                {
                    StringBuilder declarationBuilder = new StringBuilder();
                    if (Url.Contains("{" + parameter.Name + "}"))
                    {
                        parameter.Location = ParameterLocation.Path;
                    }
                    if (parameter.Location == ParameterLocation.Path ||
                        parameter.Location == ParameterLocation.Query ||
                        parameter.Location == ParameterLocation.Header)
                    {
                        declarationBuilder.Append(string.Format(CultureInfo.InvariantCulture,
                            "@{0}(\"{1}\") ",
                            parameter.Location.ToString(),
                            parameter.SerializedName));
                    }
                    else if (parameter.Location == ParameterLocation.Body)
                    {
                        declarationBuilder.Append(string.Format(CultureInfo.InvariantCulture, 
                            "@{0} ", 
                            parameter.Location.ToString()));
                    }
                    else if (parameter.Location == ParameterLocation.FormData)
                    {
                        declarationBuilder.Append(string.Format(CultureInfo.InvariantCulture,
                            "@Part(\"{0}\") ",
                            parameter.SerializedName));
                    }
                    var declarativeName = parameter.ClientProperty != null ? parameter.ClientProperty.Name : parameter.Name;
                    if (parameter.Type.IsPrimaryType(KnownPrimaryType.Stream))
                    {
                        declarationBuilder.Append("RequestBody");
                    }
                    else if ((parameter.Location != ParameterLocation.Body)
                        && parameter.Type.NeedsSpecialSerialization())
                    {
                        declarationBuilder.Append("String");
                    }
                    else
                    {
                        string typeString = parameter.Type.Name;
                        if (!parameter.IsRequired)
                        {
                            typeString = JavaCodeNamer.WrapPrimitiveType(parameter.Type).Name;
                        }
                        declarationBuilder.Append(typeString);
                    }
                    declarationBuilder.Append(" " + declarativeName);
                    declarations.Add(declarationBuilder.ToString());
                }

                var declaration = string.Join(", ", declarations);
                return declaration;
            }
        }

        public virtual string MethodParameterDeclaration
        {
            get
            {
                List<string> declarations = new List<string>();
                foreach (var parameter in LocalParameters.Where(p => !p.IsConstant))
                {
                    if (parameter.Type.IsPrimaryType(KnownPrimaryType.Stream))
                    {
                        declarations.Add("byte[] " + parameter.Name);
                    }
                    else
                    {
                        declarations.Add(parameter.Type.ParameterType().Name + " " + parameter.Name);
                    }
                }

                var declaration = string.Join(", ", declarations);
                return declaration;
            }
        }

        public virtual string MethodRequiredParameterDeclaration
        {
            get
            {
                List<string> declarations = new List<string>();
                foreach (var parameter in LocalParameters.Where(p => !p.IsConstant && p.IsRequired))
                {
                    declarations.Add(parameter.Type.ParameterType().Name + " " + parameter.Name);
                }

                var declaration = string.Join(", ", declarations);
                return declaration;
            }
        }

        public string MethodParameterInvocation
        {
            get
            {
                List<string> invocations = new List<string>();
                foreach (var parameter in LocalParameters)
                {
                    invocations.Add(parameter.Name);
                }

                var declaration = string.Join(", ", invocations);
                return declaration;
            }
        }

        public string MethodParameterApiInvocation
        {
            get
            {
                List<string> declarations = new List<string>();
                foreach (var parameter in OrderedRetrofitParameters)
                {
                    if ((parameter.Location != ParameterLocation.Body)
                         && parameter.Type.NeedsSpecialSerialization())
                    {
                        declarations.Add(parameter.ToString(parameter.Name, ClientReference));
                    }
                    else if (parameter.Type.UserHandledType() != parameter.Type)
                    {
                        declarations.Add(string.Format(CultureInfo.InvariantCulture, "new {0}({1})", parameter.Type.Name, parameter.Name));
                    }
                    else if (parameter.Type.IsPrimaryType(KnownPrimaryType.Stream))
                    {
                        declarations.Add(string.Format(CultureInfo.InvariantCulture, 
                            "RequestBody.create(MediaType.parse(\"{0}\"), {1})",
                            RequestContentType, parameter.Name));
                    }
                    else
                    {
                        declarations.Add(parameter.Name);
                    }
                }

                var declaration = string.Join(", ", declarations);
                return declaration;
            }
        }

        public string MethodParameterApiInvocationWithCallback
        {
            get
            {
                var parameters = MethodParameterApiInvocation;
                if (!parameters.IsNullOrEmpty())
                {
                    parameters += ", ";
                }
                parameters += string.Format(CultureInfo.InvariantCulture, "new ServiceResponseCallback()");
                return parameters;
            }
        }

        public string LocalMethodParameterInvocation
        {
            get
            {
                List<string> declarations = new List<string>();
                foreach (var parameter in LocalParameters)
                {
                    if ((parameter.Location != ParameterLocation.Body)
                         && parameter.Type.NeedsSpecialSerialization())
                    {
                        declarations.Add(parameter.ToString(parameter.Name, ClientReference));
                    }
                    else
                    {
                        declarations.Add(parameter.Name);
                    }
                }

                var declaration = string.Join(", ", declarations);
                return declaration;
            }
        }

        /// <summary>
        /// Generates input mapping code block.
        /// </summary>
        /// <returns></returns>
        public virtual string BuildInputMappings()
        {
            var builder = new IndentedStringBuilder();
            foreach (var transformation in InputParameterTransformation)
            {
                var nullCheck = BuildNullCheckExpression(transformation);
                bool conditionalAssignment = !string.IsNullOrEmpty(nullCheck) && !transformation.OutputParameter.IsRequired;
                if (conditionalAssignment)
                {
                    builder.AppendLine("{0} {1} = null;",
                            JavaCodeNamer.WrapPrimitiveType(transformation.OutputParameter.Type.ParameterType()).Name,
                            transformation.OutputParameter.Name);
                    builder.AppendLine("if ({0}) {{", nullCheck).Indent();
                }

                if (transformation.ParameterMappings.Any(m => !string.IsNullOrEmpty(m.OutputParameterProperty)) &&
                    transformation.OutputParameter.Type is CompositeType)
                {
                    builder.AppendLine("{0}{1} = new {2}();",
                        !conditionalAssignment ? transformation.OutputParameter.Type.ParameterType().Name + " " : "",
                        transformation.OutputParameter.Name,
                        transformation.OutputParameter.Type.Name);
                }

                foreach (var mapping in transformation.ParameterMappings)
                {
                    builder.AppendLine("{0}{1}{2};",
                        !conditionalAssignment && !(transformation.OutputParameter.Type is CompositeType) ?
                            transformation.OutputParameter.Type.ParameterType().Name + " " : "",
                        transformation.OutputParameter.Name,
                        GetMapping(mapping));
                }

                if (conditionalAssignment)
                {
                    builder.Outdent()
                       .AppendLine("}");
                }
            }

            return builder.ToString();
        }

        private static string GetMapping(ParameterMapping mapping)
        {
            string inputPath = mapping.InputParameter.Name;
            if (mapping.InputParameterProperty != null)
            {
                inputPath += ".get" + CodeNamer.PascalCase(mapping.InputParameterProperty) + "()";
            }

            string outputPath = "";
            if (mapping.OutputParameterProperty != null)
            {
                outputPath += ".set" + CodeNamer.PascalCase(mapping.OutputParameterProperty);
                return string.Format(CultureInfo.InvariantCulture, "{0}({1})", outputPath, inputPath);
            }
            else
            {
                return string.Format(CultureInfo.InvariantCulture, "{0} = {1}", outputPath, inputPath);
            }
        }

        private static string BuildNullCheckExpression(ParameterTransformation transformation)
        {
            if (transformation == null)
            {
                throw new ArgumentNullException("transformation");
            }

            return string.Join(" || ",
                transformation.ParameterMappings
                    .Where(m => !m.InputParameter.IsRequired)
                    .Select(m => m.InputParameter.Name + " != null"));
        }

        public IEnumerable<JavaParameter> RequiredNullableParameters
        {
            get
            {
                foreach (var param in JavaParameters)
                {
                    if (!param.Type.IsPrimaryType(KnownPrimaryType.Int) &&
                        !param.Type.IsPrimaryType(KnownPrimaryType.Double) &&
                        !param.Type.IsPrimaryType(KnownPrimaryType.Boolean) &&
                        !param.Type.IsPrimaryType(KnownPrimaryType.Long) &&
                        !param.IsConstant && param.IsRequired)
                    {
                        yield return param;
                    }
                }
            }
        }

        public IEnumerable<JavaParameter> ParametersToValidate
        {
            get
            {
                foreach (var param in JavaParameters)
                {
                    if (param.Type is PrimaryType ||
                        param.Type is EnumType ||
                        param.IsConstant)
                    {
                        continue;
                    }
                    yield return param;
                }
            }
        }

        /// <summary>
        /// Gets the expression for response body initialization 
        /// </summary>
        public virtual string InitializeResponseBody
        {
            get
            {
                return string.Empty;
            }
        }

        /// <summary>
        /// Generate the method parameter declarations with callback for a method
        /// </summary>
        public string MethodParameterApiDeclarationWithCallback
        {
            get
            {
                var parameters = MethodParameterApiDeclaration;
                if (!parameters.IsNullOrEmpty())
                {
                    parameters += ", ";
                }
                parameters += "ServiceResponseCallback cb";
                return parameters;
            }
        }

        public virtual string MethodParameterDeclarationWithCallback
        {
            get
            {
                var parameters = MethodParameterDeclaration;
                if (!parameters.IsNullOrEmpty())
                {
                    parameters += ", ";
                }
                parameters += string.Format(CultureInfo.InvariantCulture, "final ServiceCallback<{0}> serviceCallback",
                    GenericReturnTypeString);
                return parameters;
            }
        }

        public virtual string MethodRequiredParameterDeclarationWithCallback
        {
            get
            {
                var parameters = MethodRequiredParameterDeclaration;
                if (!parameters.IsNullOrEmpty())
                {
                    parameters += ", ";
                }
                parameters += string.Format(CultureInfo.InvariantCulture, "final ServiceCallback<{0}> serviceCallback",
                    GenericReturnTypeString);
                return parameters;
            }
        }

        public virtual string MethodParameterInvocationWithCallback
        {
            get
            {
                var parameters = MethodParameterInvocation;
                if (!parameters.IsNullOrEmpty())
                {
                    parameters += ", ";
                }
                parameters += "serviceCallback";
                return parameters;
            }
        }

        /// <summary>
        /// Get the parameters that are actually method parameters in the order they appear in the method signature
        /// exclude global parameters
        /// </summary>
        public IEnumerable<JavaParameter> LocalParameters
        {
            get
            {
                //Omit parameter-group properties for now since Java doesn't support them yet
                return JavaParameters.Where(
                    p => p != null && p.ClientProperty == null && !string.IsNullOrWhiteSpace(p.Name))
                    .OrderBy(item => !item.IsRequired);
            }
        }

        /// <summary>
        /// Get the type for operation exception
        /// </summary>
        public virtual string OperationExceptionTypeString
        {
            get
            {
                if (this.DefaultResponse.Body is CompositeType)
                {
                    CompositeType type = this.DefaultResponse.Body as CompositeType;
                    if (type.Extensions.ContainsKey(Microsoft.Rest.Generator.Extensions.NameOverrideExtension))
                    {
                        var ext = type.Extensions[Microsoft.Rest.Generator.Extensions.NameOverrideExtension] as Newtonsoft.Json.Linq.JContainer;
                        if (ext != null && ext["name"] != null)
                        {
                            return ext["name"].ToString();
                        }
                    }
                    return type.Name + "Exception";
                }
                else
                {
                    return "ServiceException";
                }
            }
        }

        public virtual IEnumerable<string> Exceptions
        {
            get
            {
                yield return OperationExceptionTypeString;
                yield return "IOException";
                if (RequiredNullableParameters.Any())
                {
                    yield return "IllegalArgumentException";
                }
            }
        }

        public virtual string ExceptionString
        {
            get
            {
                return string.Join(", ", Exceptions);
            }
        }

        public virtual List<string> ExceptionStatements
        {
            get
            {
                List<string> exceptions = new List<string>();
                exceptions.Add(OperationExceptionTypeString + " exception thrown from REST call");
                exceptions.Add("IOException exception thrown from serialization/deserialization");
                if (RequiredNullableParameters.Any())
                {
                    exceptions.Add("IllegalArgumentException exception thrown from invalid parameters");
                }
                return exceptions;
            }
        }

        /// <summary>
        /// Get the type name for the method's return type
        /// </summary>
        public string ReturnTypeString
        {
            get
            {
                if (ReturnType.Body != null)
                {
                    return JavaCodeNamer.WrapPrimitiveType(ReturnType.Body).Name;
                }
                return "void";
            }
        }
        
        public virtual string GenericReturnTypeString
        {
            get
            {
                if (ReturnType.Body != null)
                {
                    return JavaCodeNamer.WrapPrimitiveType(ReturnType.Body.UserHandledType()).Name;
                }
                return "Void";
            }
        }

        public virtual string CallbackGenericTypeString
        {
            get
            {
                return GenericReturnTypeString;
            }
        }

        public virtual string DelegateReturnTypeString
        {
            get
            {
                if (ReturnType.Body != null)
                {
                    return JavaCodeNamer.WrapPrimitiveType(ReturnType.Body).Name;
                }
                return "Void";
            }
        }

        public virtual string TypeTokenType(IType type)
        {
            return JavaCodeNamer.WrapPrimitiveType(type).Name;
        }

        public string OperationResponseType
        {
            get
            {
                if (ReturnType.Headers == null)
                {
                    return "ServiceResponse";
                }
                else
                {
                    return "ServiceResponseWithHeaders";
                }
            }
        }

        public string OperationResponseReturnTypeString
        {
            get
            {
                if (ReturnType.Headers == null)
                {
                    return string.Format(CultureInfo.InvariantCulture, "{0}<{1}>", OperationResponseType, GenericReturnTypeString);
                }
                else
                {
                    return string.Format(CultureInfo.InvariantCulture, "{0}<{1}, {2}>", OperationResponseType, GenericReturnTypeString, ReturnType.Headers.Name);
                }
            }
        }

        public virtual string DelegateOperationResponseReturnTypeString
        {
            get
            {
                if (ReturnType.Headers == null)
                {
                    return string.Format(CultureInfo.InvariantCulture, "{0}<{1}>", OperationResponseType, DelegateReturnTypeString);
                }
                else
                {
                    return string.Format(CultureInfo.InvariantCulture, "{0}<{1}, {2}>", OperationResponseType, DelegateReturnTypeString, ReturnType.Headers.Name);
                }
            }
        }

        public string CallType
        {
            get
            {
                if (this.HttpMethod == HttpMethod.Head)
                {
                    return "Void";
                }
                else
                {
                    return "ResponseBody";
                }
            }
        }

        public string InternalCallback
        {
            get
            {
                if (this.HttpMethod == HttpMethod.Head)
                {
                    return "ServiceResponseEmptyCallback";
                }
                else
                {
                    return "ServiceResponseCallback";
                }
            }
        }

        public virtual string ResponseBuilder
        {
            get
            {
                return "ServiceResponseBuilder";
            }
        }

        public virtual string RuntimeBasePackage
        {
            get
            {
                return "com.microsoft.rest";
            }
        }

        public virtual string ResponseGeneration
        {
            get
            {
                var userType = ReturnType.Body.UserHandledType();
                if (ReturnType.Body != userType)
                {
                    userType = JavaCodeNamer.WrapPrimitiveType(userType);
                    IndentedStringBuilder builder= new IndentedStringBuilder();
                    builder.AppendLine("ServiceResponse<{0}> response = {1}Delegate(call.execute());",
                        DelegateReturnTypeString, this.Name.ToCamelCase());
                    builder.AppendLine("{0} body = null;", userType.Name)
                        .AppendLine("if (response.getBody() != null) {")
                        .Indent().AppendLine("body = response.getBody().get{0}();", userType.Name)
                        .Outdent().AppendLine("}");
                    return builder.ToString();
                }
                return "";
            }
        }

        public virtual string ReturnValue
        {
            get
            {
                if (ReturnType.Body.UserHandledType() != ReturnType.Body)
                {
                    return "new ServiceResponse<" + this.GenericReturnTypeString + ">(body, response.getResponse())";
                }
                return this.Name + "Delegate(call.execute())";
            }
        }

        public virtual string SuccessCallback
        {
            get
            {
                var userType = ReturnType.Body.UserHandledType();
                if (ReturnType.Body != userType)
                {
                    userType = JavaCodeNamer.WrapPrimitiveType(userType);
                    IndentedStringBuilder builder = new IndentedStringBuilder();
                    builder.AppendLine("ServiceResponse<{0}> result = {1}Delegate(response);", DelegateReturnTypeString, this.Name);
                    builder.AppendLine("{0} body = null;", userType.Name)
                        .AppendLine("if (result.getBody() != null) {")
                        .Indent().AppendLine("body = result.getBody().get{0}();", userType.Name)
                        .Outdent().AppendLine("}");
                    builder.AppendLine("serviceCallback.success(new ServiceResponse<{0}>(body, result.getResponse()));", GenericReturnTypeString);
                    return builder.ToString();
                }
                return string.Format(CultureInfo.InvariantCulture, "serviceCallback.success({0}Delegate(response));", this.Name);
            }
        }

        public virtual string ServiceCallConstruction
        {
            get
            {
                return "final ServiceCall serviceCall = new ServiceCall(call);";
            }
        }

        public virtual string CallbackDocumentation
        {
            get
            {
                return " * @param serviceCallback the async ServiceCallback to handle successful and failed responses.";
            }
        }

        public virtual List<string> InterfaceImports
        {
            get
            {
                HashSet<string> imports = new HashSet<string>();
                // static imports
                imports.Add("com.microsoft.rest.ServiceCall");
                imports.Add("com.microsoft.rest." + OperationResponseType);
                imports.Add("com.microsoft.rest.ServiceCallback");
                // parameter types
                this.JavaParameters.ForEach(p => imports.AddRange(p.InterfaceImports));
                // return type
                imports.AddRange(this.ReturnType.Body.ImportFrom());
                // Header type
                imports.AddRange(this.ReturnType.Headers.ImportFrom());
                // exceptions
                this.ExceptionString.Split(new string[] { ", " }, StringSplitOptions.RemoveEmptyEntries)
                    .ForEach(ex => {
                        string exceptionImport = JavaCodeNamer.GetJavaException(ex, ServiceClient);
                        if (exceptionImport != null) imports.Add(JavaCodeNamer.GetJavaException(ex, ServiceClient));
                    });
                return imports.ToList();
            }
        }

        public virtual List<string> ImplImports
        {
            get
            {
                HashSet<string> imports = new HashSet<string>();
                // static imports
                imports.Add("retrofit2.Call");
                if (RequestContentType == "multipart/form-data" || RequestContentType == "application/x-www-form-urlencoded")
                {
                    imports.Add("retrofit2.http.Multipart");
                }
                else
                {
                    imports.Add("retrofit2.http.Headers");
                }
                imports.Add("retrofit2.Response");
                imports.Add("retrofit2.Retrofit");
                if (this.HttpMethod != HttpMethod.Head)
                {
                    imports.Add("okhttp3.ResponseBody");
                }
                imports.Add("com.microsoft.rest.ServiceCall");
                imports.Add("com.microsoft.rest." + OperationResponseType);
                imports.Add(RuntimeBasePackage + "." + ResponseBuilder);
                imports.Add("com.microsoft.rest.ServiceCallback");
                //// API parameters
                //this.RetrofitParameters
                //    .Where(p => p.Location == ParameterLocation.Body
                //        || !p.Type.NeedsSpecialSerialization())
                //    .ForEach(p => imports.AddRange(p.Type.ImportFrom(ServiceClient.Namespace, Namer)));
                //// parameter locations
                //this.RetrofitParameters.ForEach(p =>
                //{
                //    string locationImport = p.Location.ImportFrom();
                //    if (!string.IsNullOrEmpty(locationImport))
                //    {
                //        imports.Add(p.Location.ImportFrom());
                //    }
                //});
                this.RetrofitParameters.ForEach(p => imports.AddRange(p.ImplImports));
                // Http verb annotations
                imports.Add(this.HttpMethod.ImportFrom());
                // response type conversion
                if (this.Responses.Any())
                {
                    imports.Add("com.google.common.reflect.TypeToken");
                }
                // validation
                if (!ParametersToValidate.IsNullOrEmpty())
                {
                    imports.Add("com.microsoft.rest.Validator");
                }
                // internal callback
                if (this.CallType == "Void")
                {
                    imports.Add("com.microsoft.rest.ServiceResponseEmptyCallback");
                }
                else
                {
                    imports.Add("com.microsoft.rest.ServiceResponseCallback");
                }
                // parameter types
                this.LocalParameters.Concat(this.LogicalParameters)
                    .ForEach(p => imports.AddRange(p.Type.ImportFrom()));
                // parameter utils
                this.LocalParameters.Concat(this.LogicalParameters)
                    .ForEach(p => imports.AddRange(p.ImportFrom()));
                // return type
                imports.AddRange(this.ReturnType.Body.ImportFrom());
                if (ReturnType.Body.IsPrimaryType(KnownPrimaryType.Stream))
                {
                    imports.Add("retrofit2.http.Streaming");
                }
                // response type (can be different from return type)
                this.Responses.ForEach(r => imports.AddRange(r.Value.Body.ImportFrom()));
                // Header type
                imports.AddRange(this.ReturnType.Headers.ImportFrom());
                // exceptions
                this.ExceptionString.Split(new string[] { ", " }, StringSplitOptions.RemoveEmptyEntries)
                    .ForEach(ex =>
                    {
                        string exceptionImport = JavaCodeNamer.GetJavaException(ex, ServiceClient);
                        if (exceptionImport != null) imports.Add(JavaCodeNamer.GetJavaException(ex, ServiceClient));
                    });
                return imports.ToList();
            }
        }
    }
}