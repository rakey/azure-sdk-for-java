// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.InstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RunCommandResult model. */
@Fluent
public final class RunCommandResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunCommandResultInner.class);

    /*
     * Run command operation response.
     */
    @JsonProperty(value = "value")
    private List<InstanceViewStatus> value;

    /**
     * Get the value property: Run command operation response.
     *
     * @return the value value.
     */
    public List<InstanceViewStatus> value() {
        return this.value;
    }

    /**
     * Set the value property: Run command operation response.
     *
     * @param value the value value to set.
     * @return the RunCommandResultInner object itself.
     */
    public RunCommandResultInner withValue(List<InstanceViewStatus> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
