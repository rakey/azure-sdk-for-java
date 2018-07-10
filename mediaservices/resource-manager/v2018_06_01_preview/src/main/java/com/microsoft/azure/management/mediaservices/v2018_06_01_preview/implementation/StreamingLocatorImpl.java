/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.StreamingLocator;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.StreamingLocatorContentKey;

class StreamingLocatorImpl extends CreatableUpdatableImpl<StreamingLocator, StreamingLocatorInner, StreamingLocatorImpl> implements StreamingLocator, StreamingLocator.Definition, StreamingLocator.Update {
    private final MediaManager manager;
    private String resourceGroupName;
    private String accountName;
    private String streamingLocatorName;

    StreamingLocatorImpl(String name, MediaManager manager) {
        super(name, new StreamingLocatorInner());
        this.manager = manager;
        // Set resource name
        this.streamingLocatorName = name;
        //
    }

    StreamingLocatorImpl(StreamingLocatorInner inner, MediaManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.streamingLocatorName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "mediaServices");
        this.streamingLocatorName = IdParsingUtils.getValueFromIdByName(inner.id(), "streamingLocators");
        //
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<StreamingLocator> createResourceAsync() {
        StreamingLocatorsInner client = this.manager().inner().streamingLocators();
        return client.createAsync(this.resourceGroupName, this.accountName, this.streamingLocatorName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<StreamingLocator> updateResourceAsync() {
        StreamingLocatorsInner client = this.manager().inner().streamingLocators();
        return client.createAsync(this.resourceGroupName, this.accountName, this.streamingLocatorName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<StreamingLocatorInner> getInnerAsync() {
        StreamingLocatorsInner client = this.manager().inner().streamingLocators();
        return client.getAsync(this.resourceGroupName, this.accountName, this.streamingLocatorName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String alternativeMediaId() {
        return this.inner().alternativeMediaId();
    }

    @Override
    public String assetName() {
        return this.inner().assetName();
    }

    @Override
    public List<StreamingLocatorContentKey> contentKeys() {
        return this.inner().contentKeys();
    }

    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public String defaultContentKeyPolicyName() {
        return this.inner().defaultContentKeyPolicyName();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
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
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public UUID streamingLocatorId() {
        return this.inner().streamingLocatorId();
    }

    @Override
    public String streamingPolicyName() {
        return this.inner().streamingPolicyName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public StreamingLocatorImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public StreamingLocatorImpl withAssetName(String assetName) {
        this.inner().withAssetName(assetName);
        return this;
    }

    @Override
    public StreamingLocatorImpl withStreamingPolicyName(String streamingPolicyName) {
        this.inner().withStreamingPolicyName(streamingPolicyName);
        return this;
    }

    @Override
    public StreamingLocatorImpl withAlternativeMediaId(String alternativeMediaId) {
        this.inner().withAlternativeMediaId(alternativeMediaId);
        return this;
    }

    @Override
    public StreamingLocatorImpl withContentKeys(List<StreamingLocatorContentKey> contentKeys) {
        this.inner().withContentKeys(contentKeys);
        return this;
    }

    @Override
    public StreamingLocatorImpl withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        this.inner().withDefaultContentKeyPolicyName(defaultContentKeyPolicyName);
        return this;
    }

    @Override
    public StreamingLocatorImpl withEndTime(DateTime endTime) {
        this.inner().withEndTime(endTime);
        return this;
    }

    @Override
    public StreamingLocatorImpl withStartTime(DateTime startTime) {
        this.inner().withStartTime(startTime);
        return this;
    }

    @Override
    public StreamingLocatorImpl withStreamingLocatorId(UUID streamingLocatorId) {
        this.inner().withStreamingLocatorId(streamingLocatorId);
        return this;
    }

}
