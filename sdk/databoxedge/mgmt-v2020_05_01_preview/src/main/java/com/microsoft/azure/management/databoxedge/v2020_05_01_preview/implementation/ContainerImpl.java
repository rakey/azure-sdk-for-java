/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.Container;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ContainerStatus;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.AzureContainerDataFormat;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.RefreshDetails;
import org.joda.time.DateTime;

class ContainerImpl extends CreatableUpdatableImpl<Container, ContainerInner, ContainerImpl> implements Container, Container.Definition, Container.Update {
    private final DataBoxEdgeManager manager;
    private String deviceName;
    private String storageAccountName;
    private String containerName;
    private String resourceGroupName;

    ContainerImpl(String name, DataBoxEdgeManager manager) {
        super(name, new ContainerInner());
        this.manager = manager;
        // Set resource name
        this.containerName = name;
        //
    }

    ContainerImpl(ContainerInner inner, DataBoxEdgeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.containerName = inner.name();
        // set resource ancestor and positional variables
        this.deviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataBoxEdgeDevices");
        this.storageAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "storageAccounts");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "containers");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        //
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Container> createResourceAsync() {
        ContainersInner client = this.manager().inner().containers();
        return client.createOrUpdateAsync(this.deviceName, this.storageAccountName, this.containerName, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Container> updateResourceAsync() {
        ContainersInner client = this.manager().inner().containers();
        return client.createOrUpdateAsync(this.deviceName, this.storageAccountName, this.containerName, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ContainerInner> getInnerAsync() {
        ContainersInner client = this.manager().inner().containers();
        return client.getAsync(this.deviceName, this.storageAccountName, this.containerName, this.resourceGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ContainerStatus containerStatus() {
        return this.inner().containerStatus();
    }

    @Override
    public DateTime createdDateTime() {
        return this.inner().createdDateTime();
    }

    @Override
    public AzureContainerDataFormat dataFormat() {
        return this.inner().dataFormat();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RefreshDetails refreshDetails() {
        return this.inner().refreshDetails();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ContainerImpl withExistingStorageAccount(String deviceName, String storageAccountName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.storageAccountName = storageAccountName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ContainerImpl withDataFormat(AzureContainerDataFormat dataFormat) {
        this.inner().withDataFormat(dataFormat);
        return this;
    }

}
