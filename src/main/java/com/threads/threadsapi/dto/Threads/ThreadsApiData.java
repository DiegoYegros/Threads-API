package com.threads.threadsapi.dto.Threads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreadsApiData {
    @JsonProperty("data")
    public ThreadsApiResponse data;

    @JsonProperty("extensions")
    public Extensions extensions;

    public ThreadsApiResponse getData() {
        return data;
    }

    public void setData(ThreadsApiResponse data) {
        this.data = data;
    }

    public Extensions getExtensions() {
        return extensions;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }
    
}
