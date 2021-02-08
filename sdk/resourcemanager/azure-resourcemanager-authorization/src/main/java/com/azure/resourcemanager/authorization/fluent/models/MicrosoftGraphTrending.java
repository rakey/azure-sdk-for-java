// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** trending. */
@Fluent
public final class MicrosoftGraphTrending extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphTrending.class);

    /*
     * The lastModifiedDateTime property.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * resourceReference
     */
    @JsonProperty(value = "resourceReference")
    private MicrosoftGraphResourceReference resourceReference;

    /*
     * resourceVisualization
     */
    @JsonProperty(value = "resourceVisualization")
    private MicrosoftGraphResourceVisualization resourceVisualization;

    /*
     * Value indicating how much the document is currently trending. The larger
     * the number, the more the document is currently trending around the user
     * (the more relevant it is). Returned documents are sorted by this value.
     */
    @JsonProperty(value = "weight")
    private Double weight;

    /*
     * entity
     */
    @JsonProperty(value = "resource")
    private MicrosoftGraphEntity resource;

    /*
     * trending
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the lastModifiedDateTime property: The lastModifiedDateTime property.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The lastModifiedDateTime property.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphTrending object itself.
     */
    public MicrosoftGraphTrending withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the resourceReference property: resourceReference.
     *
     * @return the resourceReference value.
     */
    public MicrosoftGraphResourceReference resourceReference() {
        return this.resourceReference;
    }

    /**
     * Set the resourceReference property: resourceReference.
     *
     * @param resourceReference the resourceReference value to set.
     * @return the MicrosoftGraphTrending object itself.
     */
    public MicrosoftGraphTrending withResourceReference(MicrosoftGraphResourceReference resourceReference) {
        this.resourceReference = resourceReference;
        return this;
    }

    /**
     * Get the resourceVisualization property: resourceVisualization.
     *
     * @return the resourceVisualization value.
     */
    public MicrosoftGraphResourceVisualization resourceVisualization() {
        return this.resourceVisualization;
    }

    /**
     * Set the resourceVisualization property: resourceVisualization.
     *
     * @param resourceVisualization the resourceVisualization value to set.
     * @return the MicrosoftGraphTrending object itself.
     */
    public MicrosoftGraphTrending withResourceVisualization(MicrosoftGraphResourceVisualization resourceVisualization) {
        this.resourceVisualization = resourceVisualization;
        return this;
    }

    /**
     * Get the weight property: Value indicating how much the document is currently trending. The larger the number, the
     * more the document is currently trending around the user (the more relevant it is). Returned documents are sorted
     * by this value.
     *
     * @return the weight value.
     */
    public Double weight() {
        return this.weight;
    }

    /**
     * Set the weight property: Value indicating how much the document is currently trending. The larger the number, the
     * more the document is currently trending around the user (the more relevant it is). Returned documents are sorted
     * by this value.
     *
     * @param weight the weight value to set.
     * @return the MicrosoftGraphTrending object itself.
     */
    public MicrosoftGraphTrending withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the resource property: entity.
     *
     * @return the resource value.
     */
    public MicrosoftGraphEntity resource() {
        return this.resource;
    }

    /**
     * Set the resource property: entity.
     *
     * @param resource the resource value to set.
     * @return the MicrosoftGraphTrending object itself.
     */
    public MicrosoftGraphTrending withResource(MicrosoftGraphEntity resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the additionalProperties property: trending.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: trending.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTrending object itself.
     */
    public MicrosoftGraphTrending withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTrending withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (resourceReference() != null) {
            resourceReference().validate();
        }
        if (resourceVisualization() != null) {
            resourceVisualization().validate();
        }
        if (resource() != null) {
            resource().validate();
        }
    }
}
