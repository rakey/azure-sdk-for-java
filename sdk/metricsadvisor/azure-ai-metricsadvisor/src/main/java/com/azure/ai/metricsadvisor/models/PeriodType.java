// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PeriodType. */
public final class PeriodType extends ExpandableStringEnum<PeriodType> {
    /** Static value AutoDetect for PeriodType. */
    public static final PeriodType AUTO_DETECT = fromString("AutoDetect");

    /** Static value AssignValue for PeriodType. */
    public static final PeriodType ASSIGN_VALUE = fromString("AssignValue");

    /**
     * Creates or finds a PeriodType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PeriodType.
     */
    @JsonCreator
    public static PeriodType fromString(String name) {
        return fromString(name, PeriodType.class);
    }

    /** @return known PeriodType values. */
    public static Collection<PeriodType> values() {
        return values(PeriodType.class);
    }
}
