/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2020_07_01.BGPCommunity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Service Community Properties.
 */
@JsonFlatten
@SkipParentValidation
public class BgpServiceCommunityInner extends Resource {
    /**
     * The name of the bgp community. e.g. Skype.
     */
    @JsonProperty(value = "properties.serviceName")
    private String serviceName;

    /**
     * A list of bgp communities.
     */
    @JsonProperty(value = "properties.bgpCommunities")
    private List<BGPCommunity> bgpCommunities;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the name of the bgp community. e.g. Skype.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the name of the bgp community. e.g. Skype.
     *
     * @param serviceName the serviceName value to set
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get a list of bgp communities.
     *
     * @return the bgpCommunities value
     */
    public List<BGPCommunity> bgpCommunities() {
        return this.bgpCommunities;
    }

    /**
     * Set a list of bgp communities.
     *
     * @param bgpCommunities the bgpCommunities value to set
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withBgpCommunities(List<BGPCommunity> bgpCommunities) {
        this.bgpCommunities = bgpCommunities;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withId(String id) {
        this.id = id;
        return this;
    }

}
