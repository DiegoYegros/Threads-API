package com.threads.threadsapi.service;

import com.threads.threadsapi.dto.UserBasicInfo;

public interface IThreadsService {
    public UserBasicInfo getUserBasicInfo(String username);
    public String getUserIDFromUsername(String username);
}
