/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.HostingEnvironmentSite;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.SiteAvailabilityState;
import com.microsoft.azure.management.appservice.v2019_08_01.CloningInfo;
import java.util.List;
import com.microsoft.azure.management.appservice.v2019_08_01.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.v2019_08_01.HostNameSslState;
import com.microsoft.azure.management.appservice.v2019_08_01.ManagedServiceIdentity;
import java.util.UUID;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2019_08_01.RedundancyMode;
import com.microsoft.azure.management.appservice.v2019_08_01.SiteConfig;
import com.microsoft.azure.management.appservice.v2019_08_01.SlotSwapStatus;
import java.util.Map;
import com.microsoft.azure.management.appservice.v2019_08_01.UsageState;

class HostingEnvironmentSiteImpl extends WrapperImpl<SiteInner> implements HostingEnvironmentSite {
    private final AppServiceManager manager;

    HostingEnvironmentSiteImpl(SiteInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public SiteAvailabilityState availabilityState() {
        return this.inner().availabilityState();
    }

    @Override
    public Boolean clientAffinityEnabled() {
        return this.inner().clientAffinityEnabled();
    }

    @Override
    public Boolean clientCertEnabled() {
        return this.inner().clientCertEnabled();
    }

    @Override
    public String clientCertExclusionPaths() {
        return this.inner().clientCertExclusionPaths();
    }

    @Override
    public CloningInfo cloningInfo() {
        return this.inner().cloningInfo();
    }

    @Override
    public Integer containerSize() {
        return this.inner().containerSize();
    }

    @Override
    public Integer dailyMemoryTimeQuota() {
        return this.inner().dailyMemoryTimeQuota();
    }

    @Override
    public String defaultHostName() {
        return this.inner().defaultHostName();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public List<String> enabledHostNames() {
        return this.inner().enabledHostNames();
    }

    @Override
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.inner().hostingEnvironmentProfile();
    }

    @Override
    public List<String> hostNames() {
        return this.inner().hostNames();
    }

    @Override
    public Boolean hostNamesDisabled() {
        return this.inner().hostNamesDisabled();
    }

    @Override
    public List<HostNameSslState> hostNameSslStates() {
        return this.inner().hostNameSslStates();
    }

    @Override
    public Boolean httpsOnly() {
        return this.inner().httpsOnly();
    }

    @Override
    public Boolean hyperV() {
        return this.inner().hyperV();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public UUID inProgressOperationId() {
        return this.inner().inProgressOperationId();
    }

    @Override
    public Boolean isDefaultContainer() {
        return this.inner().isDefaultContainer();
    }

    @Override
    public Boolean isXenon() {
        return this.inner().isXenon();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public DateTime lastModifiedTimeUtc() {
        return this.inner().lastModifiedTimeUtc();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Integer maxNumberOfWorkers() {
        return this.inner().maxNumberOfWorkers();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String outboundIpAddresses() {
        return this.inner().outboundIpAddresses();
    }

    @Override
    public String possibleOutboundIpAddresses() {
        return this.inner().possibleOutboundIpAddresses();
    }

    @Override
    public RedundancyMode redundancyMode() {
        return this.inner().redundancyMode();
    }

    @Override
    public String repositorySiteName() {
        return this.inner().repositorySiteName();
    }

    @Override
    public Boolean reserved() {
        return this.inner().reserved();
    }

    @Override
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public Boolean scmSiteAlsoStopped() {
        return this.inner().scmSiteAlsoStopped();
    }

    @Override
    public String serverFarmId() {
        return this.inner().serverFarmId();
    }

    @Override
    public SiteConfig siteConfig() {
        return this.inner().siteConfig();
    }

    @Override
    public SlotSwapStatus slotSwapStatus() {
        return this.inner().slotSwapStatus();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

    @Override
    public DateTime suspendedTill() {
        return this.inner().suspendedTill();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String targetSwapSlot() {
        return this.inner().targetSwapSlot();
    }

    @Override
    public List<String> trafficManagerHostNames() {
        return this.inner().trafficManagerHostNames();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UsageState usageState() {
        return this.inner().usageState();
    }

}
