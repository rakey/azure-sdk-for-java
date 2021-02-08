// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AdministratorType. */
public enum AdministratorType {
    /** Enum value ActiveDirectory. */
    ACTIVE_DIRECTORY("ActiveDirectory");

    /** The actual serialized value for a AdministratorType instance. */
    private final String value;

    AdministratorType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AdministratorType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AdministratorType object, or null if unable to parse.
     */
    @JsonCreator
    public static AdministratorType fromString(String value) {
        AdministratorType[] items = AdministratorType.values();
        for (AdministratorType item : items) {
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
