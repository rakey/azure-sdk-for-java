// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.administration.models;

/**
 * Represents a rule action that does nothing.
 */
public class EmptyRuleAction extends RuleAction {
    private static final EmptyRuleAction INSTANCE = new EmptyRuleAction();

    static EmptyRuleAction getInstance() {
        return INSTANCE;
    }
}
