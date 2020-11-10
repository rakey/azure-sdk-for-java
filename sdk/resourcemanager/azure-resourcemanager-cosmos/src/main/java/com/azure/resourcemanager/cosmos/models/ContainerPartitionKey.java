// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration of the partition key to be used for partitioning data into multiple partitions. */
@Fluent
public final class ContainerPartitionKey {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerPartitionKey.class);

    /*
     * List of paths using which data within the container can be partitioned
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /*
     * Indicates the kind of algorithm used for partitioning
     */
    @JsonProperty(value = "kind")
    private PartitionKind kind;

    /*
     * Indicates the version of the partition key definition
     */
    @JsonProperty(value = "version")
    private Integer version;

    /**
     * Get the paths property: List of paths using which data within the container can be partitioned.
     *
     * @return the paths value.
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: List of paths using which data within the container can be partitioned.
     *
     * @param paths the paths value to set.
     * @return the ContainerPartitionKey object itself.
     */
    public ContainerPartitionKey withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get the kind property: Indicates the kind of algorithm used for partitioning.
     *
     * @return the kind value.
     */
    public PartitionKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Indicates the kind of algorithm used for partitioning.
     *
     * @param kind the kind value to set.
     * @return the ContainerPartitionKey object itself.
     */
    public ContainerPartitionKey withKind(PartitionKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the partition key definition.
     *
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the partition key definition.
     *
     * @param version the version value to set.
     * @return the ContainerPartitionKey object itself.
     */
    public ContainerPartitionKey withVersion(Integer version) {
        this.version = version;
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
