/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error record of the config server settings.
 */
public class ConfigServerSettingsErrorRecord {
    /**
     * The name of the config server settings error record.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The uri of the config server settings error record.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * The detail error messages of the record.
     */
    @JsonProperty(value = "messages")
    private List<String> messages;

    /**
     * Get the name of the config server settings error record.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the config server settings error record.
     *
     * @param name the name value to set
     * @return the ConfigServerSettingsErrorRecord object itself.
     */
    public ConfigServerSettingsErrorRecord withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the uri of the config server settings error record.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri of the config server settings error record.
     *
     * @param uri the uri value to set
     * @return the ConfigServerSettingsErrorRecord object itself.
     */
    public ConfigServerSettingsErrorRecord withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the detail error messages of the record.
     *
     * @return the messages value
     */
    public List<String> messages() {
        return this.messages;
    }

    /**
     * Set the detail error messages of the record.
     *
     * @param messages the messages value to set
     * @return the ConfigServerSettingsErrorRecord object itself.
     */
    public ConfigServerSettingsErrorRecord withMessages(List<String> messages) {
        this.messages = messages;
        return this;
    }

}
