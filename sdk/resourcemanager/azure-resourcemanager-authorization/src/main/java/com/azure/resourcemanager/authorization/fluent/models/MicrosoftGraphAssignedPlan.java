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
import java.util.UUID;

/** assignedPlan. */
@Fluent
public final class MicrosoftGraphAssignedPlan {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphAssignedPlan.class);

    /*
     * The date and time at which the plan was assigned; for example:
     * 2013-01-02T19:32:30Z. The Timestamp type represents date and time
     * information using ISO 8601 format and is always in UTC time. For
     * example, midnight UTC on Jan 1, 2014 would look like this:
     * '2014-01-01T00:00:00Z'
     */
    @JsonProperty(value = "assignedDateTime")
    private OffsetDateTime assignedDateTime;

    /*
     * Condition of the capability assignment. The possible values are Enabled,
     * Warning, Suspended, Deleted, LockedOut.
     */
    @JsonProperty(value = "capabilityStatus")
    private String capabilityStatus;

    /*
     * The name of the service; for example, 'Exchange'.
     */
    @JsonProperty(value = "service")
    private String service;

    /*
     * A GUID that identifies the service plan.
     */
    @JsonProperty(value = "servicePlanId")
    private UUID servicePlanId;

    /*
     * assignedPlan
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the assignedDateTime property: The date and time at which the plan was assigned; for example:
     * 2013-01-02T19:32:30Z. The Timestamp type represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @return the assignedDateTime value.
     */
    public OffsetDateTime assignedDateTime() {
        return this.assignedDateTime;
    }

    /**
     * Set the assignedDateTime property: The date and time at which the plan was assigned; for example:
     * 2013-01-02T19:32:30Z. The Timestamp type represents date and time information using ISO 8601 format and is always
     * in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     *
     * @param assignedDateTime the assignedDateTime value to set.
     * @return the MicrosoftGraphAssignedPlan object itself.
     */
    public MicrosoftGraphAssignedPlan withAssignedDateTime(OffsetDateTime assignedDateTime) {
        this.assignedDateTime = assignedDateTime;
        return this;
    }

    /**
     * Get the capabilityStatus property: Condition of the capability assignment. The possible values are Enabled,
     * Warning, Suspended, Deleted, LockedOut.
     *
     * @return the capabilityStatus value.
     */
    public String capabilityStatus() {
        return this.capabilityStatus;
    }

    /**
     * Set the capabilityStatus property: Condition of the capability assignment. The possible values are Enabled,
     * Warning, Suspended, Deleted, LockedOut.
     *
     * @param capabilityStatus the capabilityStatus value to set.
     * @return the MicrosoftGraphAssignedPlan object itself.
     */
    public MicrosoftGraphAssignedPlan withCapabilityStatus(String capabilityStatus) {
        this.capabilityStatus = capabilityStatus;
        return this;
    }

    /**
     * Get the service property: The name of the service; for example, 'Exchange'.
     *
     * @return the service value.
     */
    public String service() {
        return this.service;
    }

    /**
     * Set the service property: The name of the service; for example, 'Exchange'.
     *
     * @param service the service value to set.
     * @return the MicrosoftGraphAssignedPlan object itself.
     */
    public MicrosoftGraphAssignedPlan withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the servicePlanId property: A GUID that identifies the service plan.
     *
     * @return the servicePlanId value.
     */
    public UUID servicePlanId() {
        return this.servicePlanId;
    }

    /**
     * Set the servicePlanId property: A GUID that identifies the service plan.
     *
     * @param servicePlanId the servicePlanId value to set.
     * @return the MicrosoftGraphAssignedPlan object itself.
     */
    public MicrosoftGraphAssignedPlan withServicePlanId(UUID servicePlanId) {
        this.servicePlanId = servicePlanId;
        return this;
    }

    /**
     * Get the additionalProperties property: assignedPlan.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: assignedPlan.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAssignedPlan object itself.
     */
    public MicrosoftGraphAssignedPlan withAdditionalProperties(Map<String, Object> additionalProperties) {
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
