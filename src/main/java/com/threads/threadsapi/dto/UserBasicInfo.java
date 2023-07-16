package com.threads.threadsapi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.threads.threadsapi.dto.Threads.BioLink;
import com.threads.threadsapi.dto.Threads.HDProfilePicVersion;

public class UserBasicInfo {
    @JsonProperty("username")
    String username;
    @JsonProperty("user_id")
    String userID;
    @JsonProperty("bio_links")
    List<BioLink> bioLinks;
    @JsonProperty("profile_picture_url")
    String profilePictureURL;
    @JsonProperty("full_name")
    String fullName;
    @JsonProperty("biography")
    String biography;
    @JsonProperty("is_private")
    Boolean isPrivate;
    @JsonProperty("is_verified")
    Boolean isVerified;
    @JsonProperty("hd_profile_pic_versions")
    List<HDProfilePicVersion> hdProfilePicVersions;
    @JsonProperty("follower_count")
    Long followerCount;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public List<BioLink> getBioLinks() {
        return bioLinks;
    }
    public void setBioLinks(List<BioLink> bioLinks) {
        this.bioLinks = bioLinks;
    }
    
    public String getProfilePictureURL() {
        return profilePictureURL;
    }
    public void setProfilePictureURL(String profilePictureURL) {
        this.profilePictureURL = profilePictureURL;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getBiography() {
        return biography;
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }
    public Boolean getIsPrivate() {
        return isPrivate;
    }
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }
    public Boolean getIsVerified() {
        return isVerified;
    }
    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }
    public List<HDProfilePicVersion> getHdProfilePicVersions() {
        return hdProfilePicVersions;
    }
    public void setHdProfilePicVersions(List<HDProfilePicVersion> hdProfilePicVersions) {
        this.hdProfilePicVersions = hdProfilePicVersions;
    }
    public Long getFollowerCount() {
        return followerCount;
    }
    public void setFollowerCount(Long followerCount) {
        this.followerCount = followerCount;
    }
    
}
