// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters of ephemeral disk settings that can be specified for operating system disk.
 * &lt;br&gt;&lt;br&gt; NOTE: The ephemeral disk settings can only be specified for managed disk.
 */
@Fluent
public final class DiffDiskSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiffDiskSettings.class);

    /*
     * Specifies the ephemeral disk settings for operating system disk.
     */
    @JsonProperty(value = "option")
    private DiffDiskOptions option;

    /*
     * Specifies the ephemeral disk placement for operating system
     * disk.<br><br> Possible values are: <br><br> **CacheDisk** <br><br>
     * **ResourceDisk** <br><br> Default: **CacheDisk** if one is configured
     * for the VM size otherwise **ResourceDisk** is used.<br><br> Refer to VM
     * size documentation for Windows VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes
     * and Linux VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/sizes to
     * check which VM sizes exposes a cache disk.
     */
    @JsonProperty(value = "placement")
    private DiffDiskPlacement placement;

    /**
     * Get the option property: Specifies the ephemeral disk settings for operating system disk.
     *
     * @return the option value.
     */
    public DiffDiskOptions option() {
        return this.option;
    }

    /**
     * Set the option property: Specifies the ephemeral disk settings for operating system disk.
     *
     * @param option the option value to set.
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings withOption(DiffDiskOptions option) {
        this.option = option;
        return this;
    }

    /**
     * Get the placement property: Specifies the ephemeral disk placement for operating system disk.&lt;br&gt;&lt;br&gt;
     * Possible values are: &lt;br&gt;&lt;br&gt; **CacheDisk** &lt;br&gt;&lt;br&gt; **ResourceDisk**
     * &lt;br&gt;&lt;br&gt; Default: **CacheDisk** if one is configured for the VM size otherwise **ResourceDisk** is
     * used.&lt;br&gt;&lt;br&gt; Refer to VM size documentation for Windows VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes and Linux VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/sizes to check which VM sizes exposes a cache disk.
     *
     * @return the placement value.
     */
    public DiffDiskPlacement placement() {
        return this.placement;
    }

    /**
     * Set the placement property: Specifies the ephemeral disk placement for operating system disk.&lt;br&gt;&lt;br&gt;
     * Possible values are: &lt;br&gt;&lt;br&gt; **CacheDisk** &lt;br&gt;&lt;br&gt; **ResourceDisk**
     * &lt;br&gt;&lt;br&gt; Default: **CacheDisk** if one is configured for the VM size otherwise **ResourceDisk** is
     * used.&lt;br&gt;&lt;br&gt; Refer to VM size documentation for Windows VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes and Linux VM at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/sizes to check which VM sizes exposes a cache disk.
     *
     * @param placement the placement value to set.
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings withPlacement(DiffDiskPlacement placement) {
        this.placement = placement;
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
