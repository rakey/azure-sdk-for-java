// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.models.AccessRights;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of a namespace authorization rule. */
@JsonFlatten
@Fluent
public class SharedAccessAuthorizationRuleResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedAccessAuthorizationRuleResourceInner.class);

    /*
     * The rights associated with the rule.
     */
    @JsonProperty(value = "properties.rights")
    private List<AccessRights> rights;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the rights property: The rights associated with the rule.
     *
     * @return the rights value.
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights property: The rights associated with the rule.
     *
     * @param rights the rights value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
