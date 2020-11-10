/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.management.network.v2018_11_01.ConnectionMonitorQueryResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_11_01.ConnectionMonitorSourceStatus;
import java.util.List;
import com.microsoft.azure.management.network.v2018_11_01.ConnectionStateSnapshot;

class ConnectionMonitorQueryResultImpl extends WrapperImpl<ConnectionMonitorQueryResultInner> implements ConnectionMonitorQueryResult {
    private final NetworkManager manager;
    ConnectionMonitorQueryResultImpl(ConnectionMonitorQueryResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ConnectionMonitorSourceStatus sourceStatus() {
        return this.inner().sourceStatus();
    }

    @Override
    public List<ConnectionStateSnapshot> states() {
        return this.inner().states();
    }

}
