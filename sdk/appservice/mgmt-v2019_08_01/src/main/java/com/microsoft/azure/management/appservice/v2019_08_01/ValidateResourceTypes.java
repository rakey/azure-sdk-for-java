/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ValidateResourceTypes.
 */
public final class ValidateResourceTypes extends ExpandableStringEnum<ValidateResourceTypes> {
    /** Static value ServerFarm for ValidateResourceTypes. */
    public static final ValidateResourceTypes SERVER_FARM = fromString("ServerFarm");

    /** Static value Site for ValidateResourceTypes. */
    public static final ValidateResourceTypes SITE = fromString("Site");

    /**
     * Creates or finds a ValidateResourceTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding ValidateResourceTypes
     */
    @JsonCreator
    public static ValidateResourceTypes fromString(String name) {
        return fromString(name, ValidateResourceTypes.class);
    }

    /**
     * @return known ValidateResourceTypes values
     */
    public static Collection<ValidateResourceTypes> values() {
        return values(ValidateResourceTypes.class);
    }
}
