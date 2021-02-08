// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.models.JobInput;
import com.azure.resourcemanager.mediaservices.models.JobOutput;
import com.azure.resourcemanager.mediaservices.models.JobState;
import com.azure.resourcemanager.mediaservices.models.Priority;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using
 * EventGrid.
 */
@JsonFlatten
@Fluent
public class JobInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobInner.class);

    /*
     * The UTC date and time when the customer has created the Job, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The current state of the job.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /*
     * Optional customer supplied description of the Job.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The inputs for the Job.
     */
    @JsonProperty(value = "properties.input")
    private JobInput input;

    /*
     * The UTC date and time when the customer has last updated the Job, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The outputs for the Job.
     */
    @JsonProperty(value = "properties.outputs")
    private List<JobOutput> outputs;

    /*
     * Priority with which the job should be processed. Higher priority jobs
     * are processed before lower priority jobs. If not set, the default is
     * normal.
     */
    @JsonProperty(value = "properties.priority")
    private Priority priority;

    /*
     * Customer provided key, value pairs that will be returned in Job and
     * JobOutput state events.
     */
    @JsonProperty(value = "properties.correlationData")
    private Map<String, String> correlationData;

    /*
     * The UTC date and time at which this Job began processing.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The UTC date and time at which this Job finished processing.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /**
     * Get the created property: The UTC date and time when the customer has created the Job, in 'YYYY-MM-DDThh:mm:ssZ'
     * format.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the state property: The current state of the job.
     *
     * @return the state value.
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Get the description property: Optional customer supplied description of the Job.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Optional customer supplied description of the Job.
     *
     * @param description the description value to set.
     * @return the JobInner object itself.
     */
    public JobInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the input property: The inputs for the Job.
     *
     * @return the input value.
     */
    public JobInput input() {
        return this.input;
    }

    /**
     * Set the input property: The inputs for the Job.
     *
     * @param input the input value to set.
     * @return the JobInner object itself.
     */
    public JobInner withInput(JobInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the lastModified property: The UTC date and time when the customer has last updated the Job, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the outputs property: The outputs for the Job.
     *
     * @return the outputs value.
     */
    public List<JobOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: The outputs for the Job.
     *
     * @param outputs the outputs value to set.
     * @return the JobInner object itself.
     */
    public JobInner withOutputs(List<JobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the priority property: Priority with which the job should be processed. Higher priority jobs are processed
     * before lower priority jobs. If not set, the default is normal.
     *
     * @return the priority value.
     */
    public Priority priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority with which the job should be processed. Higher priority jobs are processed
     * before lower priority jobs. If not set, the default is normal.
     *
     * @param priority the priority value to set.
     * @return the JobInner object itself.
     */
    public JobInner withPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the correlationData property: Customer provided key, value pairs that will be returned in Job and JobOutput
     * state events.
     *
     * @return the correlationData value.
     */
    public Map<String, String> correlationData() {
        return this.correlationData;
    }

    /**
     * Set the correlationData property: Customer provided key, value pairs that will be returned in Job and JobOutput
     * state events.
     *
     * @param correlationData the correlationData value to set.
     * @return the JobInner object itself.
     */
    public JobInner withCorrelationData(Map<String, String> correlationData) {
        this.correlationData = correlationData;
        return this;
    }

    /**
     * Get the startTime property: The UTC date and time at which this Job began processing.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The UTC date and time at which this Job finished processing.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (input() != null) {
            input().validate();
        }
        if (outputs() != null) {
            outputs().forEach(e -> e.validate());
        }
    }
}
