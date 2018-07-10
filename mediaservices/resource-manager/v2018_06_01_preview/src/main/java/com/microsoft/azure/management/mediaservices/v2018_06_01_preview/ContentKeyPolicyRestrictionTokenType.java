/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ContentKeyPolicyRestrictionTokenType.
 */
public enum ContentKeyPolicyRestrictionTokenType {
    /** Represents a ContentKeyPolicyRestrictionTokenType that is unavailable in current API version. */
    UNKNOWN("Unknown"),

    /** Simple Web Token. */
    SWT("Swt"),

    /** JSON Web Token. */
    JWT("Jwt");

    /** The actual serialized value for a ContentKeyPolicyRestrictionTokenType instance. */
    private String value;

    ContentKeyPolicyRestrictionTokenType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ContentKeyPolicyRestrictionTokenType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ContentKeyPolicyRestrictionTokenType object, or null if unable to parse.
     */
    @JsonCreator
    public static ContentKeyPolicyRestrictionTokenType fromString(String value) {
        ContentKeyPolicyRestrictionTokenType[] items = ContentKeyPolicyRestrictionTokenType.values();
        for (ContentKeyPolicyRestrictionTokenType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
