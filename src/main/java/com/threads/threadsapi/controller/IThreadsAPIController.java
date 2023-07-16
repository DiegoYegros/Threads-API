package com.threads.threadsapi.controller;

import com.threads.threadsapi.dto.UserBasicInfo;

public interface IThreadsAPIController {
    public UserBasicInfo getBasicUserInfo(String userId);
    public String getUserIDFromUsername(String username);    
}
