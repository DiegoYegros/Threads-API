package com.threads.threadsapi.dto.Threads;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("is_private")
    public Boolean isPrivate;

    @JsonProperty("profile_pic_url")
    public String profilePicURL;

    @JsonProperty("username")
    public String username;

    @JsonProperty("hd_profile_pic_versions")
    public List<HDProfilePicVersion> hdProfilePicVersions;

    @JsonProperty("is_verified")
    public Boolean isVerified;

    @JsonProperty("biography")
    public String biography;

    @JsonProperty("biography_with_entities")
    public BiographyWithEntities biographyWithEntities;

    @JsonProperty("follower_count")
    public Long followerCount;

    @JsonProperty("profile_context_facepile_users")
    public Object profileContextFacepileUsers;

    @JsonProperty("bio_links")
    public List<BioLink> bioLinks;

    @JsonProperty("pk")
    public String pk;

    @JsonProperty("full_name")
    public String fullName;

    @JsonProperty("id")
    public Object id;

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }


    public String getProfilePicURL() {
        return profilePicURL;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<HDProfilePicVersion> getHdProfilePicVersions() {
        return hdProfilePicVersions;
    }

    public void setHdProfilePicVersions(List<HDProfilePicVersion> hdProfilePicVersions) {
        this.hdProfilePicVersions = hdProfilePicVersions;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public BiographyWithEntities getBiographyWithEntities() {
        return biographyWithEntities;
    }

    public void setBiographyWithEntities(BiographyWithEntities biographyWithEntities) {
        this.biographyWithEntities = biographyWithEntities;
    }

    public Long getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Long followerCount) {
        this.followerCount = followerCount;
    }

    public Object getProfileContextFacepileUsers() {
        return profileContextFacepileUsers;
    }

    public void setProfileContextFacepileUsers(Object profileContextFacepileUsers) {
        this.profileContextFacepileUsers = profileContextFacepileUsers;
    }

    public List<BioLink> getBioLinks() {
        return bioLinks;
    }

    public void setBioLinks(List<BioLink> bioLinks) {
        this.bioLinks = bioLinks;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [isPrivate=" + isPrivate + ", profilePicURL=" + profilePicURL + ", username=" + username
                + ", hdProfilePicVersions=" + hdProfilePicVersions + ", isVerified=" + isVerified + ", biography="
                + biography + ", biographyWithEntities=" + biographyWithEntities + ", followerCount=" + followerCount
                + ", profileContextFacepileUsers=" + profileContextFacepileUsers + ", bioLinks=" + bioLinks + ", pk="
                + pk + ", fullName=" + fullName + ", id=" + id + "]";
    }
    
}
