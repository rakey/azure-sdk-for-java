// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.IpConfigurationProfileInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Container network interface configuration child resource. */
@JsonFlatten
@Fluent
public class ContainerNetworkInterfaceConfiguration extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerNetworkInterfaceConfiguration.class);

    /*
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A list of ip configurations of the container network interface
     * configuration.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<IpConfigurationProfileInner> ipConfigurations;

    /*
     * A list of container network interfaces created from this container
     * network interface configuration.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaces")
    private List<SubResource> containerNetworkInterfaces;

    /*
     * The provisioning state of the container network interface configuration
     * resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * Get the ipConfigurations property: A list of ip configurations of the container network interface configuration.
     *
     * @return the ipConfigurations value.
     */
    public List<IpConfigurationProfileInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: A list of ip configurations of the container network interface configuration.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withIpConfigurations(
        List<IpConfigurationProfileInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the containerNetworkInterfaces property: A list of container network interfaces created from this container
     * network interface configuration.
     *
     * @return the containerNetworkInterfaces value.
     */
    public List<SubResource> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }

    /**
     * Set the containerNetworkInterfaces property: A list of container network interfaces created from this container
     * network interface configuration.
     *
     * @param containerNetworkInterfaces the containerNetworkInterfaces value to set.
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withContainerNetworkInterfaces(
        List<SubResource> containerNetworkInterfaces) {
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the container network interface configuration
     * resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerNetworkInterfaceConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
