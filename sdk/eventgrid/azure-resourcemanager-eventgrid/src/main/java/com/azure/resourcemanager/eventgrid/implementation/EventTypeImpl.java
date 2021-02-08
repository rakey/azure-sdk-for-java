// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.fluent.models.EventTypeInner;
import com.azure.resourcemanager.eventgrid.models.EventType;

public final class EventTypeImpl implements EventType {
    private EventTypeInner innerObject;

    private final EventGridManager serviceManager;

    EventTypeImpl(EventTypeInner innerObject, EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String schemaUrl() {
        return this.innerModel().schemaUrl();
    }

    public Boolean isInDefaultSet() {
        return this.innerModel().isInDefaultSet();
    }

    public EventTypeInner innerModel() {
        return this.innerObject;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }
}
