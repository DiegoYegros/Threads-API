package com.threads.threadsapi.dto.Threads;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreadsApiResponse {

    @JsonProperty("userData")
    public UserData userData;

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }
    
}