// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.models.ActivityLogAlertActionList;
import com.azure.resourcemanager.monitor.models.ActivityLogAlertAllOfCondition;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An activity log alert resource. */
@JsonFlatten
@Fluent
public class ActivityLogAlertResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActivityLogAlertResourceInner.class);

    /*
     * A list of resourceIds that will be used as prefixes. The alert will only
     * apply to activityLogs with resourceIds that fall under one of these
     * prefixes. This list must include at least one item.
     */
    @JsonProperty(value = "properties.scopes")
    private List<String> scopes;

    /*
     * Indicates whether this activity log alert is enabled. If an activity log
     * alert is not enabled, then none of its actions will be activated.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * The condition that will cause this alert to activate.
     */
    @JsonProperty(value = "properties.condition")
    private ActivityLogAlertAllOfCondition condition;

    /*
     * The actions that will activate when the condition is met.
     */
    @JsonProperty(value = "properties.actions")
    private ActivityLogAlertActionList actions;

    /*
     * A description of this activity log alert.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the scopes property: A list of resourceIds that will be used as prefixes. The alert will only apply to
     * activityLogs with resourceIds that fall under one of these prefixes. This list must include at least one item.
     *
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A list of resourceIds that will be used as prefixes. The alert will only apply to
     * activityLogs with resourceIds that fall under one of these prefixes. This list must include at least one item.
     *
     * @param scopes the scopes value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this activity log alert is enabled. If an activity log alert is not
     * enabled, then none of its actions will be activated.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this activity log alert is enabled. If an activity log alert is not
     * enabled, then none of its actions will be activated.
     *
     * @param enabled the enabled value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the condition property: The condition that will cause this alert to activate.
     *
     * @return the condition value.
     */
    public ActivityLogAlertAllOfCondition condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The condition that will cause this alert to activate.
     *
     * @param condition the condition value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withCondition(ActivityLogAlertAllOfCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the actions property: The actions that will activate when the condition is met.
     *
     * @return the actions value.
     */
    public ActivityLogAlertActionList actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions that will activate when the condition is met.
     *
     * @param actions the actions value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withActions(ActivityLogAlertActionList actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the description property: A description of this activity log alert.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of this activity log alert.
     *
     * @param description the description value to set.
     * @return the ActivityLogAlertResourceInner object itself.
     */
    public ActivityLogAlertResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (condition() != null) {
            condition().validate();
        }
        if (actions() != null) {
            actions().validate();
        }
    }
}
