// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Route table resource. */
@JsonFlatten
@Fluent
public class RouteTableInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteTableInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Collection of routes contained within a route table.
     */
    @JsonProperty(value = "properties.routes")
    private List<RouteInner> routes;

    /*
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /*
     * Whether to disable the routes learned by BGP on that route table. True
     * means disable.
     */
    @JsonProperty(value = "properties.disableBgpRoutePropagation")
    private Boolean disableBgpRoutePropagation;

    /*
     * The provisioning state of the route table resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the routes property: Collection of routes contained within a route table.
     *
     * @return the routes value.
     */
    public List<RouteInner> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: Collection of routes contained within a route table.
     *
     * @param routes the routes value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withRoutes(List<RouteInner> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that route table.
     * True means disable.
     *
     * @return the disableBgpRoutePropagation value.
     */
    public Boolean disableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation;
    }

    /**
     * Set the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that route table.
     * True means disable.
     *
     * @param disableBgpRoutePropagation the disableBgpRoutePropagation value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route table resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }
}
