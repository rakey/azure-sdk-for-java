/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SSLStatus.
 */
public final class SSLStatus extends ExpandableStringEnum<SSLStatus> {
    /** Static value Enabled for SSLStatus. */
    public static final SSLStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for SSLStatus. */
    public static final SSLStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SSLStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding SSLStatus
     */
    @JsonCreator
    public static SSLStatus fromString(String name) {
        return fromString(name, SSLStatus.class);
    }

    /**
     * @return known SSLStatus values
     */
    public static Collection<SSLStatus> values() {
        return values(SSLStatus.class);
    }
}
