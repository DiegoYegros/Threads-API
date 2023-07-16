package com.threads.threadsapi.dto.Threads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BiographyWithEntities {
    @JsonProperty("entities")
    public Object[] entities;
    @JsonProperty("raw_text")
    public String rawText;
    public Object[] getEntities() {
        return entities;
    }
    public void setEntities(Object[] entities) {
        this.entities = entities;
    }
    public String getRawText() {
        return rawText;
    }
    public void setRawText(String rawText) {
        this.rawText = rawText;
    }
    
    
}
