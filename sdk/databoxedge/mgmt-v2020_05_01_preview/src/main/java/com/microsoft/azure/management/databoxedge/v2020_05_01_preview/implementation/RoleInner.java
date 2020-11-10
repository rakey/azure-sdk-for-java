/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ARMBaseModel;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.IoTRole;

/**
 * Compute role.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = RoleInner.class)
@JsonTypeName("Role")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "IOT", value = IoTRole.class)
})
public class RoleInner extends ARMBaseModel {
}
