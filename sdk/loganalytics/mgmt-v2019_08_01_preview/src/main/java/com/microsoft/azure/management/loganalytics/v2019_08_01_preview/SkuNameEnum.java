/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2019_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuNameEnum.
 */
public final class SkuNameEnum extends ExpandableStringEnum<SkuNameEnum> {
    /** Static value CapacityReservation for SkuNameEnum. */
    public static final SkuNameEnum CAPACITY_RESERVATION = fromString("CapacityReservation");

    /**
     * Creates or finds a SkuNameEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuNameEnum
     */
    @JsonCreator
    public static SkuNameEnum fromString(String name) {
        return fromString(name, SkuNameEnum.class);
    }

    /**
     * @return known SkuNameEnum values
     */
    public static Collection<SkuNameEnum> values() {
        return values(SkuNameEnum.class);
    }
}
