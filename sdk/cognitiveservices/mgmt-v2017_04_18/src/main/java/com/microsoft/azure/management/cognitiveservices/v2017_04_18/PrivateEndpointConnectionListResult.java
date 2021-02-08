/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.CognitiveServicesManager;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.PrivateEndpointConnectionListResultInner;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.PrivateEndpointConnectionInner;
import java.util.List;

/**
 * Type representing PrivateEndpointConnectionListResult.
 */
public interface PrivateEndpointConnectionListResult extends HasInner<PrivateEndpointConnectionListResultInner>, HasManager<CognitiveServicesManager> {
    /**
     * @return the value value.
     */
    List<PrivateEndpointConnectionInner> value();

}
