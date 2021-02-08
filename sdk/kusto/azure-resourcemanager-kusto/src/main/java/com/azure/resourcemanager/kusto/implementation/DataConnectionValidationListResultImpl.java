// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationListResultInner;
import com.azure.resourcemanager.kusto.models.DataConnectionValidationListResult;
import com.azure.resourcemanager.kusto.models.DataConnectionValidationResult;
import java.util.Collections;
import java.util.List;

public final class DataConnectionValidationListResultImpl implements DataConnectionValidationListResult {
    private DataConnectionValidationListResultInner innerObject;

    private final KustoManager serviceManager;

    DataConnectionValidationListResultImpl(
        DataConnectionValidationListResultInner innerObject, KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<DataConnectionValidationResult> value() {
        List<DataConnectionValidationResult> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DataConnectionValidationListResultInner innerModel() {
        return this.innerObject;
    }

    private KustoManager manager() {
        return this.serviceManager;
    }
}
