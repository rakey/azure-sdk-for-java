/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The predicted change to the resource property.
 */
public class WhatIfPropertyChange {
    /**
     * The path of the property.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /**
     * The type of property change. Possible values include: 'Create',
     * 'Delete', 'Modify', 'Array'.
     */
    @JsonProperty(value = "propertyChangeType", required = true)
    private PropertyChangeType propertyChangeType;

    /**
     * The value of the property before the deployment is executed.
     */
    @JsonProperty(value = "before")
    private Object before;

    /**
     * The value of the property after the deployment is executed.
     */
    @JsonProperty(value = "after")
    private Object after;

    /**
     * Nested property changes.
     */
    @JsonProperty(value = "children")
    private List<WhatIfPropertyChange> children;

    /**
     * Get the path of the property.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path of the property.
     *
     * @param path the path value to set
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the type of property change. Possible values include: 'Create', 'Delete', 'Modify', 'Array'.
     *
     * @return the propertyChangeType value
     */
    public PropertyChangeType propertyChangeType() {
        return this.propertyChangeType;
    }

    /**
     * Set the type of property change. Possible values include: 'Create', 'Delete', 'Modify', 'Array'.
     *
     * @param propertyChangeType the propertyChangeType value to set
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withPropertyChangeType(PropertyChangeType propertyChangeType) {
        this.propertyChangeType = propertyChangeType;
        return this;
    }

    /**
     * Get the value of the property before the deployment is executed.
     *
     * @return the before value
     */
    public Object before() {
        return this.before;
    }

    /**
     * Set the value of the property before the deployment is executed.
     *
     * @param before the before value to set
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withBefore(Object before) {
        this.before = before;
        return this;
    }

    /**
     * Get the value of the property after the deployment is executed.
     *
     * @return the after value
     */
    public Object after() {
        return this.after;
    }

    /**
     * Set the value of the property after the deployment is executed.
     *
     * @param after the after value to set
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withAfter(Object after) {
        this.after = after;
        return this;
    }

    /**
     * Get nested property changes.
     *
     * @return the children value
     */
    public List<WhatIfPropertyChange> children() {
        return this.children;
    }

    /**
     * Set nested property changes.
     *
     * @param children the children value to set
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withChildren(List<WhatIfPropertyChange> children) {
        this.children = children;
        return this;
    }

}
