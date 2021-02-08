// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Path rule of URL path map of an application gateway. */
@JsonFlatten
@Fluent
public class ApplicationGatewayPathRuleInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayPathRuleInner.class);

    /*
     * Name of the path rule that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Path rules of URL path map.
     */
    @JsonProperty(value = "properties.paths")
    private List<String> paths;

    /*
     * Backend address pool resource of URL path map path rule.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * Backend http settings resource of URL path map path rule.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /*
     * Redirect configuration resource of URL path map path rule.
     */
    @JsonProperty(value = "properties.redirectConfiguration")
    private SubResource redirectConfiguration;

    /*
     * Rewrite rule set resource of URL path map path rule.
     */
    @JsonProperty(value = "properties.rewriteRuleSet")
    private SubResource rewriteRuleSet;

    /*
     * The provisioning state of the path rule resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Reference to the FirewallPolicy resource.
     */
    @JsonProperty(value = "properties.firewallPolicy")
    private SubResource firewallPolicy;

    /**
     * Get the name property: Name of the path rule that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the path rule that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the paths property: Path rules of URL path map.
     *
     * @return the paths value.
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: Path rules of URL path map.
     *
     * @param paths the paths value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of URL path map path rule.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of URL path map path rule.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings property: Backend http settings resource of URL path map path rule.
     *
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Backend http settings resource of URL path map path rule.
     *
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the redirectConfiguration property: Redirect configuration resource of URL path map path rule.
     *
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set the redirectConfiguration property: Redirect configuration resource of URL path map path rule.
     *
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Rewrite rule set resource of URL path map path rule.
     *
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.rewriteRuleSet;
    }

    /**
     * Set the rewriteRuleSet property: Rewrite rule set resource of URL path map path rule.
     *
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withRewriteRuleSet(SubResource rewriteRuleSet) {
        this.rewriteRuleSet = rewriteRuleSet;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the path rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayPathRuleInner withId(String id) {
        super.withId(id);
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
