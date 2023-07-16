package com.threads.threadsapi.mapper;

import com.threads.threadsapi.dto.UserBasicInfo;
import com.threads.threadsapi.dto.Threads.ThreadsApiResponse;

public class ThreadsMapper {
    private ThreadsMapper() {
    }
    public static UserBasicInfo mapUserBasicInfo(ThreadsApiResponse threadsApiResponse){
        UserBasicInfo userBasicInfo = new UserBasicInfo();
        userBasicInfo.setUsername(threadsApiResponse.getUserData().getUser().getUsername());
        userBasicInfo.setBioLinks(threadsApiResponse.getUserData().getUser().getBioLinks());
        userBasicInfo.setFullName(threadsApiResponse.getUserData().getUser().getFullName());
        userBasicInfo.setHdProfilePicVersions(threadsApiResponse.getUserData().getUser().getHdProfilePicVersions());
        userBasicInfo.setIsPrivate(threadsApiResponse.getUserData().getUser().getIsPrivate());
        userBasicInfo.setIsVerified(threadsApiResponse.getUserData().getUser().getIsVerified());
        userBasicInfo.setProfilePictureURL(threadsApiResponse.getUserData().getUser().getProfilePicURL());
        userBasicInfo.setUserID(threadsApiResponse.getUserData().getUser().getPk());
        userBasicInfo.setBiography(threadsApiResponse.getUserData().getUser().getBiography());
        userBasicInfo.setFollowerCount(threadsApiResponse.getUserData().getUser().getFollowerCount());
        return userBasicInfo;
    }
}
