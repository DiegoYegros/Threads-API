package com.threads.threadsapi.dto.Threads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BioLink {
    @JsonProperty("url")
    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
