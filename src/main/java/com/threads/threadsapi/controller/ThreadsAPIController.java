package com.threads.threadsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threads.threadsapi.dto.UserBasicInfo;
import com.threads.threadsapi.service.IThreadsService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/${api.version}/threads")
@Log4j2
public class ThreadsAPIController implements IThreadsAPIController {
    
    @Autowired
    public IThreadsService threadsService;

    @Override
    @Operation(summary = "Get basic user info from user ID")
    @GetMapping("/{userId}")
    public UserBasicInfo getBasicUserInfo(String userId){
        return threadsService.getUserBasicInfo(userId);
    }

    
    @Override
    @Operation(summary = "Get user ID from username")
    @GetMapping("/user/{username}")
    public String getUserIDFromUsername(String username) {
        return threadsService.getUserIDFromUsername(username);
    }
}
