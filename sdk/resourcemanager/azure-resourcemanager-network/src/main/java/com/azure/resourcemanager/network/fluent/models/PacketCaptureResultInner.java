// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about packet capture session. */
@JsonFlatten
@Fluent
public class PacketCaptureResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PacketCaptureResultInner.class);

    /*
     * Name of the packet capture session.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * ID of the packet capture operation.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The ID of the targeted resource, only VM is currently supported.
     */
    @JsonProperty(value = "properties.target")
    private String target;

    /*
     * Number of bytes captured per packet, the remaining bytes are truncated.
     */
    @JsonProperty(value = "properties.bytesToCapturePerPacket")
    private Integer bytesToCapturePerPacket;

    /*
     * Maximum size of the capture output.
     */
    @JsonProperty(value = "properties.totalBytesPerSession")
    private Integer totalBytesPerSession;

    /*
     * Maximum duration of the capture session in seconds.
     */
    @JsonProperty(value = "properties.timeLimitInSeconds")
    private Integer timeLimitInSeconds;

    /*
     * The storage location for a packet capture session.
     */
    @JsonProperty(value = "properties.storageLocation")
    private PacketCaptureStorageLocation storageLocation;

    /*
     * A list of packet capture filters.
     */
    @JsonProperty(value = "properties.filters")
    private List<PacketCaptureFilter> filters;

    /*
     * The provisioning state of the packet capture session.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the packet capture session.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: ID of the packet capture operation.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
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
     * Get the target property: The ID of the targeted resource, only VM is currently supported.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The ID of the targeted resource, only VM is currently supported.
     *
     * @param target the target value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @return the bytesToCapturePerPacket value.
     */
    public Integer bytesToCapturePerPacket() {
        return this.bytesToCapturePerPacket;
    }

    /**
     * Set the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withBytesToCapturePerPacket(Integer bytesToCapturePerPacket) {
        this.bytesToCapturePerPacket = bytesToCapturePerPacket;
        return this;
    }

    /**
     * Get the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @return the totalBytesPerSession value.
     */
    public Integer totalBytesPerSession() {
        return this.totalBytesPerSession;
    }

    /**
     * Set the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @param totalBytesPerSession the totalBytesPerSession value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTotalBytesPerSession(Integer totalBytesPerSession) {
        this.totalBytesPerSession = totalBytesPerSession;
        return this;
    }

    /**
     * Get the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @return the timeLimitInSeconds value.
     */
    public Integer timeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    /**
     * Set the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @param timeLimitInSeconds the timeLimitInSeconds value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        this.timeLimitInSeconds = timeLimitInSeconds;
        return this;
    }

    /**
     * Get the storageLocation property: The storage location for a packet capture session.
     *
     * @return the storageLocation value.
     */
    public PacketCaptureStorageLocation storageLocation() {
        return this.storageLocation;
    }

    /**
     * Set the storageLocation property: The storage location for a packet capture session.
     *
     * @param storageLocation the storageLocation value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Get the filters property: A list of packet capture filters.
     *
     * @return the filters value.
     */
    public List<PacketCaptureFilter> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: A list of packet capture filters.
     *
     * @param filters the filters value to set.
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withFilters(List<PacketCaptureFilter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet capture session.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageLocation() != null) {
            storageLocation().validate();
        }
        if (filters() != null) {
            filters().forEach(e -> e.validate());
        }
    }
}
