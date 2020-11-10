/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties related to EventHub.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType", defaultImpl = EventHub.class)
@JsonTypeName("EventHub")
public class EventHub extends DigitalTwinsEndpointResourceProperties {
    /**
     * PrimaryConnectionString of the endpoint. Will be obfuscated during read.
     */
    @JsonProperty(value = "connectionStringPrimaryKey", required = true)
    private String connectionStringPrimaryKey;

    /**
     * SecondaryConnectionString of the endpoint. Will be obfuscated during
     * read.
     */
    @JsonProperty(value = "connectionStringSecondaryKey")
    private String connectionStringSecondaryKey;

    /**
     * Get primaryConnectionString of the endpoint. Will be obfuscated during read.
     *
     * @return the connectionStringPrimaryKey value
     */
    public String connectionStringPrimaryKey() {
        return this.connectionStringPrimaryKey;
    }

    /**
     * Set primaryConnectionString of the endpoint. Will be obfuscated during read.
     *
     * @param connectionStringPrimaryKey the connectionStringPrimaryKey value to set
     * @return the EventHub object itself.
     */
    public EventHub withConnectionStringPrimaryKey(String connectionStringPrimaryKey) {
        this.connectionStringPrimaryKey = connectionStringPrimaryKey;
        return this;
    }

    /**
     * Get secondaryConnectionString of the endpoint. Will be obfuscated during read.
     *
     * @return the connectionStringSecondaryKey value
     */
    public String connectionStringSecondaryKey() {
        return this.connectionStringSecondaryKey;
    }

    /**
     * Set secondaryConnectionString of the endpoint. Will be obfuscated during read.
     *
     * @param connectionStringSecondaryKey the connectionStringSecondaryKey value to set
     * @return the EventHub object itself.
     */
    public EventHub withConnectionStringSecondaryKey(String connectionStringSecondaryKey) {
        this.connectionStringSecondaryKey = connectionStringSecondaryKey;
        return this;
    }

}
