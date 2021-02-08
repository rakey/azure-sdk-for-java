/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.management.frontdoor.v2020_05_01.EndpointType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Defines the properties of a preconfigured endpoint.
 */
@JsonFlatten
@SkipParentValidation
public class PreconfiguredEndpointInner extends Resource {
    /**
     * The description of the endpoint.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The endpoint that is preconfigured.
     */
    @JsonProperty(value = "properties.endpoint")
    private String endpoint;

    /**
     * The type of endpoint. Possible values include: 'AFD', 'AzureRegion',
     * 'CDN', 'ATM'.
     */
    @JsonProperty(value = "properties.endpointType")
    private EndpointType endpointType;

    /**
     * The preconfigured endpoint backend.
     */
    @JsonProperty(value = "properties.backend")
    private String backend;

    /**
     * Get the description of the endpoint.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the endpoint.
     *
     * @param description the description value to set
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the endpoint that is preconfigured.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint that is preconfigured.
     *
     * @param endpoint the endpoint value to set
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the type of endpoint. Possible values include: 'AFD', 'AzureRegion', 'CDN', 'ATM'.
     *
     * @return the endpointType value
     */
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Set the type of endpoint. Possible values include: 'AFD', 'AzureRegion', 'CDN', 'ATM'.
     *
     * @param endpointType the endpointType value to set
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * Get the preconfigured endpoint backend.
     *
     * @return the backend value
     */
    public String backend() {
        return this.backend;
    }

    /**
     * Set the preconfigured endpoint backend.
     *
     * @param backend the backend value to set
     * @return the PreconfiguredEndpointInner object itself.
     */
    public PreconfiguredEndpointInner withBackend(String backend) {
        this.backend = backend;
        return this;
    }

}
