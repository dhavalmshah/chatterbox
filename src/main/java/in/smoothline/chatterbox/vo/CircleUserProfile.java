package in.smoothline.chatterbox.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class CircleUserProfile
{
    private String  circleUserId;
    private String  userId;
    private String  homeServer;
    private String  accessToken;
    private int     mobileNumber;
    private String  emailId;
    private int     circlePowerLevel;
    private String  profilePictureUrl;
    private String  userBio;
    private String  isActive;
    private String  createdTs;
    private String  lastModifiedTs;
    
    public String getCircleUserId() {
        return circleUserId;
    }

    public void setCircleUserId(String circleUserId) {
        this.circleUserId = circleUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHomeServer() {
        return homeServer;
    }

    public void setHomeServer(String homeServer) {
        this.homeServer = homeServer;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getCirclePowerLevel() {
        return circlePowerLevel;
    }

    public void setCirclePowerLevel(int circlePowerLevel) {
        this.circlePowerLevel = circlePowerLevel;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }

    public String getLastModifiedTs() {
        return lastModifiedTs;
    }

    public void setLastModifiedTs(String lastModifiedTs) {
        this.lastModifiedTs = lastModifiedTs;
    }
    
}