// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.OAuth2PermissionGrantInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OAuth2PermissionGrantsClient. */
public interface OAuth2PermissionGrantsClient {
    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<OAuth2PermissionGrantInner> listAsync(String filter);

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<OAuth2PermissionGrantInner> listAsync();

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @param filter This is the Service Principal ObjectId associated with the app.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OAuth2PermissionGrantInner> list(String filter, Context context);

    /**
     * Queries OAuth2 permissions grants for the relevant SP ObjectId of an app.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server response for get oauth2 permissions grants.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OAuth2PermissionGrantInner> list();

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<OAuth2PermissionGrantInner>> createWithResponseAsync(OAuth2PermissionGrantInner body);

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<OAuth2PermissionGrantInner> createAsync(OAuth2PermissionGrantInner body);

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<OAuth2PermissionGrantInner> createAsync();

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OAuth2PermissionGrantInner create();

    /**
     * Grants OAuth2 permissions for the relevant resource Ids of an app.
     *
     * @param body The relevant app Service Principal Object Id and the Service Principal Object Id you want to grant.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OAuth2PermissionGrantInner> createWithResponse(OAuth2PermissionGrantInner body, Context context);

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String objectId);

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String objectId);

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String objectId);

    /**
     * Delete a OAuth2 permission grant for the relevant resource Ids of an app.
     *
     * @param objectId The object ID of a permission grant.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.models.GraphErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String objectId, Context context);
}
