/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a managed rule group override setting.
 */
public class ManagedRuleGroupOverride {
    /**
     * Describes the managed rule group to override.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /**
     * Describes the exclusions that are applied to all rules in the group.
     */
    @JsonProperty(value = "exclusions")
    private List<ManagedRuleExclusion> exclusions;

    /**
     * List of rules that will be disabled. If none specified, all rules in the
     * group will be disabled.
     */
    @JsonProperty(value = "rules")
    private List<ManagedRuleOverride> rules;

    /**
     * Get describes the managed rule group to override.
     *
     * @return the ruleGroupName value
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set describes the managed rule group to override.
     *
     * @param ruleGroupName the ruleGroupName value to set
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get describes the exclusions that are applied to all rules in the group.
     *
     * @return the exclusions value
     */
    public List<ManagedRuleExclusion> exclusions() {
        return this.exclusions;
    }

    /**
     * Set describes the exclusions that are applied to all rules in the group.
     *
     * @param exclusions the exclusions value to set
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withExclusions(List<ManagedRuleExclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Get list of rules that will be disabled. If none specified, all rules in the group will be disabled.
     *
     * @return the rules value
     */
    public List<ManagedRuleOverride> rules() {
        return this.rules;
    }

    /**
     * Set list of rules that will be disabled. If none specified, all rules in the group will be disabled.
     *
     * @param rules the rules value to set
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRules(List<ManagedRuleOverride> rules) {
        this.rules = rules;
        return this;
    }

}
