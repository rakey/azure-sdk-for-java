// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The SparkScheduler model. */
@Fluent
public final class SparkScheduler {
    /*
     * The submittedAt property.
     */
    @JsonProperty(value = "submittedAt")
    private OffsetDateTime submittedAt;

    /*
     * The scheduledAt property.
     */
    @JsonProperty(value = "scheduledAt")
    private OffsetDateTime scheduledAt;

    /*
     * The endedAt property.
     */
    @JsonProperty(value = "endedAt")
    private OffsetDateTime endedAt;

    /*
     * The cancellationRequestedAt property.
     */
    @JsonProperty(value = "cancellationRequestedAt")
    private OffsetDateTime cancellationRequestedAt;

    /*
     * The currentState property.
     */
    @JsonProperty(value = "currentState")
    private SchedulerCurrentState currentState;

    /**
     * Get the submittedAt property: The submittedAt property.
     *
     * @return the submittedAt value.
     */
    public OffsetDateTime getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * Set the submittedAt property: The submittedAt property.
     *
     * @param submittedAt the submittedAt value to set.
     * @return the SparkScheduler object itself.
     */
    public SparkScheduler setSubmittedAt(OffsetDateTime submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * Get the scheduledAt property: The scheduledAt property.
     *
     * @return the scheduledAt value.
     */
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }

    /**
     * Set the scheduledAt property: The scheduledAt property.
     *
     * @param scheduledAt the scheduledAt value to set.
     * @return the SparkScheduler object itself.
     */
    public SparkScheduler setScheduledAt(OffsetDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
        return this;
    }

    /**
     * Get the endedAt property: The endedAt property.
     *
     * @return the endedAt value.
     */
    public OffsetDateTime getEndedAt() {
        return this.endedAt;
    }

    /**
     * Set the endedAt property: The endedAt property.
     *
     * @param endedAt the endedAt value to set.
     * @return the SparkScheduler object itself.
     */
    public SparkScheduler setEndedAt(OffsetDateTime endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    /**
     * Get the cancellationRequestedAt property: The cancellationRequestedAt property.
     *
     * @return the cancellationRequestedAt value.
     */
    public OffsetDateTime getCancellationRequestedAt() {
        return this.cancellationRequestedAt;
    }

    /**
     * Set the cancellationRequestedAt property: The cancellationRequestedAt property.
     *
     * @param cancellationRequestedAt the cancellationRequestedAt value to set.
     * @return the SparkScheduler object itself.
     */
    public SparkScheduler setCancellationRequestedAt(OffsetDateTime cancellationRequestedAt) {
        this.cancellationRequestedAt = cancellationRequestedAt;
        return this;
    }

    /**
     * Get the currentState property: The currentState property.
     *
     * @return the currentState value.
     */
    public SchedulerCurrentState getCurrentState() {
        return this.currentState;
    }

    /**
     * Set the currentState property: The currentState property.
     *
     * @param currentState the currentState value to set.
     * @return the SparkScheduler object itself.
     */
    public SparkScheduler setCurrentState(SchedulerCurrentState currentState) {
        this.currentState = currentState;
        return this;
    }
}
