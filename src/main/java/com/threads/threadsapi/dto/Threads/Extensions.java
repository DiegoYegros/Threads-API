package com.threads.threadsapi.dto.Threads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Extensions {

    @JsonProperty("is_final")
    public Boolean isFinal;

    public Boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
    }
    
}