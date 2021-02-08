/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.management.monitor.v2019_11_01.OnboardingStatus;
import com.microsoft.azure.management.monitor.v2019_11_01.DataStatus;
import java.util.List;
import com.microsoft.azure.management.monitor.v2019_11_01.DataContainer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * VM Insights onboarding status for a resource.
 */
@JsonFlatten
public class VMInsightsOnboardingStatusInner extends ProxyResource {
    /**
     * Azure Resource Manager identifier of the resource whose onboarding
     * status is being represented.
     */
    @JsonProperty(value = "properties.resourceId", required = true)
    private String resourceId;

    /**
     * The onboarding status for the resource. Note that, a higher level scope,
     * e.g., resource group or subscription, is considered onboarded if at
     * least one resource under it is onboarded. Possible values include:
     * 'onboarded', 'notOnboarded', 'unknown'.
     */
    @JsonProperty(value = "properties.onboardingStatus", required = true)
    private OnboardingStatus onboardingStatus;

    /**
     * The status of VM Insights data from the resource. When reported as
     * `present` the data array will contain information about the data
     * containers to which data for the specified resource is being routed.
     * Possible values include: 'present', 'notPresent'.
     */
    @JsonProperty(value = "properties.dataStatus", required = true)
    private DataStatus dataStatus;

    /**
     * Containers that currently store VM Insights data for the specified
     * resource.
     */
    @JsonProperty(value = "properties.data")
    private List<DataContainer> data;

    /**
     * Get azure Resource Manager identifier of the resource whose onboarding status is being represented.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set azure Resource Manager identifier of the resource whose onboarding status is being represented.
     *
     * @param resourceId the resourceId value to set
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the onboarding status for the resource. Note that, a higher level scope, e.g., resource group or subscription, is considered onboarded if at least one resource under it is onboarded. Possible values include: 'onboarded', 'notOnboarded', 'unknown'.
     *
     * @return the onboardingStatus value
     */
    public OnboardingStatus onboardingStatus() {
        return this.onboardingStatus;
    }

    /**
     * Set the onboarding status for the resource. Note that, a higher level scope, e.g., resource group or subscription, is considered onboarded if at least one resource under it is onboarded. Possible values include: 'onboarded', 'notOnboarded', 'unknown'.
     *
     * @param onboardingStatus the onboardingStatus value to set
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withOnboardingStatus(OnboardingStatus onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
        return this;
    }

    /**
     * Get the status of VM Insights data from the resource. When reported as `present` the data array will contain information about the data containers to which data for the specified resource is being routed. Possible values include: 'present', 'notPresent'.
     *
     * @return the dataStatus value
     */
    public DataStatus dataStatus() {
        return this.dataStatus;
    }

    /**
     * Set the status of VM Insights data from the resource. When reported as `present` the data array will contain information about the data containers to which data for the specified resource is being routed. Possible values include: 'present', 'notPresent'.
     *
     * @param dataStatus the dataStatus value to set
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
        return this;
    }

    /**
     * Get containers that currently store VM Insights data for the specified resource.
     *
     * @return the data value
     */
    public List<DataContainer> data() {
        return this.data;
    }

    /**
     * Set containers that currently store VM Insights data for the specified resource.
     *
     * @param data the data value to set
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withData(List<DataContainer> data) {
        this.data = data;
        return this;
    }

}
