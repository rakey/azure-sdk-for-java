/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation.HealthcareApisManager;
import com.microsoft.azure.management.healthcareapis.v2020_03_30.implementation.ServicesNameAvailabilityInfoInner;

/**
 * Type representing ServicesNameAvailabilityInfo.
 */
public interface ServicesNameAvailabilityInfo extends HasInner<ServicesNameAvailabilityInfoInner>, HasManager<HealthcareApisManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    ServiceNameUnavailabilityReason reason();

}
