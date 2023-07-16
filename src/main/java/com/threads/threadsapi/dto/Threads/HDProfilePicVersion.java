package com.threads.threadsapi.dto.Threads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HDProfilePicVersion {
 
    @JsonProperty("height")
    public Long height;
    @JsonProperty("url")
    public String url;
    @JsonProperty("width")
    public Long width;
    public Long getHeight() {
        return height;
    }
    public void setHeight(Long height) {
        this.height = height;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Long getWidth() {
        return width;
    }
    public void setWidth(Long width) {
        this.width = width;
    }
    
    
}

