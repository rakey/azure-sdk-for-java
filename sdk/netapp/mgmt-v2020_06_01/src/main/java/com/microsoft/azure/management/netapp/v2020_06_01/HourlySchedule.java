/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hourly Schedule properties.
 */
public class HourlySchedule {
    /**
     * Hourly snapshot count to keep.
     */
    @JsonProperty(value = "snapshotsToKeep")
    private Integer snapshotsToKeep;

    /**
     * Indicates which minute snapshot should be taken.
     */
    @JsonProperty(value = "minute")
    private Integer minute;

    /**
     * Resource size in bytes, current storage usage for the volume in bytes.
     */
    @JsonProperty(value = "usedBytes")
    private Long usedBytes;

    /**
     * Get hourly snapshot count to keep.
     *
     * @return the snapshotsToKeep value
     */
    public Integer snapshotsToKeep() {
        return this.snapshotsToKeep;
    }

    /**
     * Set hourly snapshot count to keep.
     *
     * @param snapshotsToKeep the snapshotsToKeep value to set
     * @return the HourlySchedule object itself.
     */
    public HourlySchedule withSnapshotsToKeep(Integer snapshotsToKeep) {
        this.snapshotsToKeep = snapshotsToKeep;
        return this;
    }

    /**
     * Get indicates which minute snapshot should be taken.
     *
     * @return the minute value
     */
    public Integer minute() {
        return this.minute;
    }

    /**
     * Set indicates which minute snapshot should be taken.
     *
     * @param minute the minute value to set
     * @return the HourlySchedule object itself.
     */
    public HourlySchedule withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * Get resource size in bytes, current storage usage for the volume in bytes.
     *
     * @return the usedBytes value
     */
    public Long usedBytes() {
        return this.usedBytes;
    }

    /**
     * Set resource size in bytes, current storage usage for the volume in bytes.
     *
     * @param usedBytes the usedBytes value to set
     * @return the HourlySchedule object itself.
     */
    public HourlySchedule withUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
        return this;
    }

}
