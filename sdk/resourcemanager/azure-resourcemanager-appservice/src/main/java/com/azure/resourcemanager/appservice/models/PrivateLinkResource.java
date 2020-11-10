// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A private link resource. */
@Fluent
public final class PrivateLinkResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResource.class);

    /*
     * The id property.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Name of a private link resource
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type property.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * Properties of a private link resource
     */
    @JsonProperty(value = "properties", required = true)
    private PrivateLinkResourceProperties properties;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the PrivateLinkResource object itself.
     */
    public PrivateLinkResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of a private link resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of a private link resource.
     *
     * @param name the name value to set.
     * @return the PrivateLinkResource object itself.
     */
    public PrivateLinkResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the PrivateLinkResource object itself.
     */
    public PrivateLinkResource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: Properties of a private link resource.
     *
     * @return the properties value.
     */
    public PrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of a private link resource.
     *
     * @param properties the properties value to set.
     * @return the PrivateLinkResource object itself.
     */
    public PrivateLinkResource withProperties(PrivateLinkResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model PrivateLinkResource"));
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model PrivateLinkResource"));
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model PrivateLinkResource"));
        }
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model PrivateLinkResource"));
        } else {
            properties().validate();
        }
    }
}
