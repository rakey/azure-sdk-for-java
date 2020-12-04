/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Managed Certificate used for https.
 */
public class ManagedCertificateParameters {
    /**
     * The type of the Secret to create. Possible values include:
     * 'UrlSigningKey', 'CustomerCertificate', 'ManagedCertificate'.
     */
    @JsonProperty(value = "type", required = true)
    private SecretType type;

    /**
     * Subject name in the certificate.
     */
    @JsonProperty(value = "subject")
    private String subject;

    /**
     * Certificate expiration date.
     */
    @JsonProperty(value = "expirationDate")
    private String expirationDate;

    /**
     * Certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * Get the type of the Secret to create. Possible values include: 'UrlSigningKey', 'CustomerCertificate', 'ManagedCertificate'.
     *
     * @return the type value
     */
    public SecretType type() {
        return this.type;
    }

    /**
     * Set the type of the Secret to create. Possible values include: 'UrlSigningKey', 'CustomerCertificate', 'ManagedCertificate'.
     *
     * @param type the type value to set
     * @return the ManagedCertificateParameters object itself.
     */
    public ManagedCertificateParameters withType(SecretType type) {
        this.type = type;
        return this;
    }

    /**
     * Get subject name in the certificate.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set subject name in the certificate.
     *
     * @param subject the subject value to set
     * @return the ManagedCertificateParameters object itself.
     */
    public ManagedCertificateParameters withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get certificate expiration date.
     *
     * @return the expirationDate value
     */
    public String expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set certificate expiration date.
     *
     * @param expirationDate the expirationDate value to set
     * @return the ManagedCertificateParameters object itself.
     */
    public ManagedCertificateParameters withExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get certificate thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set
     * @return the ManagedCertificateParameters object itself.
     */
    public ManagedCertificateParameters withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

}
