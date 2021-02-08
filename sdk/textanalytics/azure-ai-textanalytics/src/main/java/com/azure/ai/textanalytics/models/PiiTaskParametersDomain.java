// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

/** Defines values for PiiTaskParametersDomain. */
@Immutable
public final class PiiTaskParametersDomain extends ExpandableStringEnum<PiiTaskParametersDomain> {
    /** Static value phi for PiiTaskParametersDomain. */
    public static final PiiTaskParametersDomain PHI = fromString("phi");

    /** Static value none for PiiTaskParametersDomain. */
    public static final PiiTaskParametersDomain NONE = fromString("none");

    /**
     * Creates or finds a PiiTaskParametersDomain from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PiiTaskParametersDomain.
     */
    @JsonCreator
    public static PiiTaskParametersDomain fromString(String name) {
        return fromString(name, PiiTaskParametersDomain.class);
    }
}
