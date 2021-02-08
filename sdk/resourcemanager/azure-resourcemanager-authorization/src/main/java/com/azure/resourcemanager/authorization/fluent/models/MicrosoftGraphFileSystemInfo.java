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

/** fileSystemInfo. */
@Fluent
public final class MicrosoftGraphFileSystemInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphFileSystemInfo.class);

    /*
     * The UTC date and time the file was created on a client.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * The UTC date and time the file was last accessed. Available for the
     * recent file list only.
     */
    @JsonProperty(value = "lastAccessedDateTime")
    private OffsetDateTime lastAccessedDateTime;

    /*
     * The UTC date and time the file was last modified on a client.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * fileSystemInfo
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the createdDateTime property: The UTC date and time the file was created on a client.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The UTC date and time the file was created on a client.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphFileSystemInfo object itself.
     */
    public MicrosoftGraphFileSystemInfo withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the lastAccessedDateTime property: The UTC date and time the file was last accessed. Available for the recent
     * file list only.
     *
     * @return the lastAccessedDateTime value.
     */
    public OffsetDateTime lastAccessedDateTime() {
        return this.lastAccessedDateTime;
    }

    /**
     * Set the lastAccessedDateTime property: The UTC date and time the file was last accessed. Available for the recent
     * file list only.
     *
     * @param lastAccessedDateTime the lastAccessedDateTime value to set.
     * @return the MicrosoftGraphFileSystemInfo object itself.
     */
    public MicrosoftGraphFileSystemInfo withLastAccessedDateTime(OffsetDateTime lastAccessedDateTime) {
        this.lastAccessedDateTime = lastAccessedDateTime;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The UTC date and time the file was last modified on a client.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The UTC date and time the file was last modified on a client.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphFileSystemInfo object itself.
     */
    public MicrosoftGraphFileSystemInfo withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: fileSystemInfo.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: fileSystemInfo.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphFileSystemInfo object itself.
     */
    public MicrosoftGraphFileSystemInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
