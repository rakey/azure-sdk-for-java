/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import java.util.List;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.VirtualMachineScaleSetExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machine scale set extension profile.
 */
public class VirtualMachineScaleSetExtensionProfile {
    /**
     * The virtual machine scale set child extension resources.
     */
    @JsonProperty(value = "extensions")
    private List<VirtualMachineScaleSetExtensionInner> extensions;

    /**
     * Get the virtual machine scale set child extension resources.
     *
     * @return the extensions value
     */
    public List<VirtualMachineScaleSetExtensionInner> extensions() {
        return this.extensions;
    }

    /**
     * Set the virtual machine scale set child extension resources.
     *
     * @param extensions the extensions value to set
     * @return the VirtualMachineScaleSetExtensionProfile object itself.
     */
    public VirtualMachineScaleSetExtensionProfile withExtensions(List<VirtualMachineScaleSetExtensionInner> extensions) {
        this.extensions = extensions;
        return this;
    }

}
