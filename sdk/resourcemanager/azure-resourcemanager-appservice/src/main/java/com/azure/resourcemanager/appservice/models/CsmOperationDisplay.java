// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Meta data about operation used for display in portal. */
@Fluent
public final class CsmOperationDisplay {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CsmOperationDisplay.class);

    /*
     * The provider property.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The resource property.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The operation property.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: The provider property.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The provider property.
     *
     * @param provider the provider value to set.
     * @return the CsmOperationDisplay object itself.
     */
    public CsmOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the CsmOperationDisplay object itself.
     */
    public CsmOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: The operation property.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The operation property.
     *
     * @param operation the operation value to set.
     * @return the CsmOperationDisplay object itself.
     */
    public CsmOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: The description property.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     *
     * @param description the description value to set.
     * @return the CsmOperationDisplay object itself.
     */
    public CsmOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
