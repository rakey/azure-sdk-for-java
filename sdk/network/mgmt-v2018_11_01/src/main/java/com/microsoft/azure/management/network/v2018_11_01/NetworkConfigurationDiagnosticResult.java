/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network configuration diagnostic result corresponded to provided traffic
 * query.
 */
public class NetworkConfigurationDiagnosticResult {
    /**
     * The profile property.
     */
    @JsonProperty(value = "profile")
    private NetworkConfigurationDiagnosticProfile profile;

    /**
     * The networkSecurityGroupResult property.
     */
    @JsonProperty(value = "networkSecurityGroupResult")
    private NetworkSecurityGroupResult networkSecurityGroupResult;

    /**
     * Get the profile value.
     *
     * @return the profile value
     */
    public NetworkConfigurationDiagnosticProfile profile() {
        return this.profile;
    }

    /**
     * Set the profile value.
     *
     * @param profile the profile value to set
     * @return the NetworkConfigurationDiagnosticResult object itself.
     */
    public NetworkConfigurationDiagnosticResult withProfile(NetworkConfigurationDiagnosticProfile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get the networkSecurityGroupResult value.
     *
     * @return the networkSecurityGroupResult value
     */
    public NetworkSecurityGroupResult networkSecurityGroupResult() {
        return this.networkSecurityGroupResult;
    }

    /**
     * Set the networkSecurityGroupResult value.
     *
     * @param networkSecurityGroupResult the networkSecurityGroupResult value to set
     * @return the NetworkConfigurationDiagnosticResult object itself.
     */
    public NetworkConfigurationDiagnosticResult withNetworkSecurityGroupResult(NetworkSecurityGroupResult networkSecurityGroupResult) {
        this.networkSecurityGroupResult = networkSecurityGroupResult;
        return this;
    }

}
