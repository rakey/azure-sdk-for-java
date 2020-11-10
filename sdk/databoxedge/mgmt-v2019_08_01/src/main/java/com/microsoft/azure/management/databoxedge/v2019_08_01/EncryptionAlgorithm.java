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
 * Defines values for EncryptionAlgorithm.
 */
public final class EncryptionAlgorithm extends ExpandableStringEnum<EncryptionAlgorithm> {
    /** Static value None for EncryptionAlgorithm. */
    public static final EncryptionAlgorithm NONE = fromString("None");

    /** Static value AES256 for EncryptionAlgorithm. */
    public static final EncryptionAlgorithm AES256 = fromString("AES256");

    /** Static value RSAES_PKCS1_v_1_5 for EncryptionAlgorithm. */
    public static final EncryptionAlgorithm RSAES_PKCS1_V_1_5 = fromString("RSAES_PKCS1_v_1_5");

    /**
     * Creates or finds a EncryptionAlgorithm from its string representation.
     * @param name a name to look for
     * @return the corresponding EncryptionAlgorithm
     */
    @JsonCreator
    public static EncryptionAlgorithm fromString(String name) {
        return fromString(name, EncryptionAlgorithm.class);
    }

    /**
     * @return known EncryptionAlgorithm values
     */
    public static Collection<EncryptionAlgorithm> values() {
        return values(EncryptionAlgorithm.class);
    }
}
