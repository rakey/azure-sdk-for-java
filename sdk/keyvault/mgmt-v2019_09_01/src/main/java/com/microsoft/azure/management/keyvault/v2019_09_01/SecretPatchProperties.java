/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the secret.
 */
public class SecretPatchProperties {
    /**
     * The value of the secret.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * The content type of the secret.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * The attributes of the secret.
     */
    @JsonProperty(value = "attributes")
    private SecretAttributes attributes;

    /**
     * Get the value of the secret.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value of the secret.
     *
     * @param value the value value to set
     * @return the SecretPatchProperties object itself.
     */
    public SecretPatchProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the content type of the secret.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the content type of the secret.
     *
     * @param contentType the contentType value to set
     * @return the SecretPatchProperties object itself.
     */
    public SecretPatchProperties withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the attributes of the secret.
     *
     * @return the attributes value
     */
    public SecretAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes of the secret.
     *
     * @param attributes the attributes value to set
     * @return the SecretPatchProperties object itself.
     */
    public SecretPatchProperties withAttributes(SecretAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

}
