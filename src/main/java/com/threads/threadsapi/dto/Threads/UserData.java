package com.threads.threadsapi.dto.Threads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserData {
    @JsonProperty("user")
    public User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
