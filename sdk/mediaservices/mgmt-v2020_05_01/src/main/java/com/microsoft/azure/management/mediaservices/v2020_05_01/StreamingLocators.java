/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.StreamingLocatorsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing StreamingLocators.
 */
public interface StreamingLocators extends SupportsCreating<StreamingLocator.DefinitionStages.Blank>, HasInner<StreamingLocatorsInner> {
    /**
     * List Content Keys.
     * List Content Keys used by this Streaming Locator.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListContentKeysResponse> listContentKeysAsync(String resourceGroupName, String accountName, String streamingLocatorName);

    /**
     * List Paths.
     * List Paths supported by this Streaming Locator.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ListPathsResponse> listPathsAsync(String resourceGroupName, String accountName, String streamingLocatorName);

    /**
     * Get a Streaming Locator.
     * Get the details of a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StreamingLocator> getAsync(String resourceGroupName, String accountName, String streamingLocatorName);

    /**
     * List Streaming Locators.
     * Lists the Streaming Locators in the account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StreamingLocator> listAsync(final String resourceGroupName, final String accountName);

    /**
     * Delete a Streaming Locator.
     * Deletes a Streaming Locator in the Media Services account.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param streamingLocatorName The Streaming Locator name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String streamingLocatorName);

}
