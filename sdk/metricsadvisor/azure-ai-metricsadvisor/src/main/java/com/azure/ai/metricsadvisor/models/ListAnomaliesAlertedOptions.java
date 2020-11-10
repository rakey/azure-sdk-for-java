// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor.models;

/**
 * Describes the additional parameters for the API to list anomalies in an alert.
 */
public final class ListAnomaliesAlertedOptions {
    private Integer top;
    private Integer skip;

    /**
     * Gets limit indicating the number of items to be included in a service returned page.
     *
     * @return The top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Gets the number of items in the queried collection that are to be skipped and not included
     * in the returned result.
     *
     * @return The skip value.
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * Sets limit indicating the number of items to be included in a service returned page.
     *
     * @param top The top value.
     * @return The ListAnomaliesAlertedOptions itself.
     */
    public ListAnomaliesAlertedOptions setTop(int top) {
        this.top = top;
        return this;
    }

    /**
     * Sets the number of items in the queried collection that are to be skipped and not included
     * in the returned result.
     *
     * @param skip The skip value.
     * @return ListAnomaliesAlertedOptions itself.
     */
    public ListAnomaliesAlertedOptions setSkip(int skip) {
        this.skip = skip;
        return this;
    }
}
