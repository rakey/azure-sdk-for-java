/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Post body schema for CreateKb operation.
 */
public class CreateKbDTO {
    /**
     * Friendly name for the knowledgebase.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * List of Q-A (QnADTO) to be added to the knowledgebase. Q-A Ids are
     * assigned by the service and should be omitted.
     */
    @JsonProperty(value = "qnaList")
    private List<QnADTO> qnaList;

    /**
     * List of URLs to be used for extracting Q-A.
     */
    @JsonProperty(value = "urls")
    private List<String> urls;

    /**
     * List of files from which to Extract Q-A.
     */
    @JsonProperty(value = "files")
    private List<FileDTO> files;

    /**
     * Enable hierarchical extraction of Q-A from files and urls. Value to be
     * considered False if this field is not present.
     */
    @JsonProperty(value = "enableHierarchicalExtraction")
    private Boolean enableHierarchicalExtraction;

    /**
     * Text string to be used as the answer in any Q-A which has no extracted
     * answer from the document but has a hierarchy. Required when
     * EnableHierarchicalExtraction field is set to True.
     */
    @JsonProperty(value = "defaultAnswerUsedForExtraction")
    private String defaultAnswerUsedForExtraction;

    /**
     * Language of the knowledgebase. Please find the list of supported
     * languages &lt;a
     * href="https://aka.ms/qnamaker-languages#languages-supported"
     * target="_blank"&gt;here&lt;/a&gt;.
     */
    @JsonProperty(value = "language")
    private String language;

    /**
     * Set to true to enable creating KBs in different languages for the same
     * resource.
     */
    @JsonProperty(value = "enableMultipleLanguages")
    private Boolean enableMultipleLanguages;

    /**
     * Default answer sent to user if no good match is found in the KB.
     */
    @JsonProperty(value = "defaultAnswer")
    private String defaultAnswer;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the qnaList value.
     *
     * @return the qnaList value
     */
    public List<QnADTO> qnaList() {
        return this.qnaList;
    }

    /**
     * Set the qnaList value.
     *
     * @param qnaList the qnaList value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withQnaList(List<QnADTO> qnaList) {
        this.qnaList = qnaList;
        return this;
    }

    /**
     * Get the urls value.
     *
     * @return the urls value
     */
    public List<String> urls() {
        return this.urls;
    }

    /**
     * Set the urls value.
     *
     * @param urls the urls value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    /**
     * Get the files value.
     *
     * @return the files value
     */
    public List<FileDTO> files() {
        return this.files;
    }

    /**
     * Set the files value.
     *
     * @param files the files value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withFiles(List<FileDTO> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the enableHierarchicalExtraction value.
     *
     * @return the enableHierarchicalExtraction value
     */
    public Boolean enableHierarchicalExtraction() {
        return this.enableHierarchicalExtraction;
    }

    /**
     * Set the enableHierarchicalExtraction value.
     *
     * @param enableHierarchicalExtraction the enableHierarchicalExtraction value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withEnableHierarchicalExtraction(Boolean enableHierarchicalExtraction) {
        this.enableHierarchicalExtraction = enableHierarchicalExtraction;
        return this;
    }

    /**
     * Get the defaultAnswerUsedForExtraction value.
     *
     * @return the defaultAnswerUsedForExtraction value
     */
    public String defaultAnswerUsedForExtraction() {
        return this.defaultAnswerUsedForExtraction;
    }

    /**
     * Set the defaultAnswerUsedForExtraction value.
     *
     * @param defaultAnswerUsedForExtraction the defaultAnswerUsedForExtraction value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withDefaultAnswerUsedForExtraction(String defaultAnswerUsedForExtraction) {
        this.defaultAnswerUsedForExtraction = defaultAnswerUsedForExtraction;
        return this;
    }

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the enableMultipleLanguages value.
     *
     * @return the enableMultipleLanguages value
     */
    public Boolean enableMultipleLanguages() {
        return this.enableMultipleLanguages;
    }

    /**
     * Set the enableMultipleLanguages value.
     *
     * @param enableMultipleLanguages the enableMultipleLanguages value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withEnableMultipleLanguages(Boolean enableMultipleLanguages) {
        this.enableMultipleLanguages = enableMultipleLanguages;
        return this;
    }

    /**
     * Get the defaultAnswer value.
     *
     * @return the defaultAnswer value
     */
    public String defaultAnswer() {
        return this.defaultAnswer;
    }

    /**
     * Set the defaultAnswer value.
     *
     * @param defaultAnswer the defaultAnswer value to set
     * @return the CreateKbDTO object itself.
     */
    public CreateKbDTO withDefaultAnswer(String defaultAnswer) {
        this.defaultAnswer = defaultAnswer;
        return this;
    }

}
