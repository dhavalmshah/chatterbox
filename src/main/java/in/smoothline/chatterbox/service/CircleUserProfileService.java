package in.smoothline.chatterbox.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.smoothline.chatterbox.rowmapper.CircleUserProfileRowMapper;
import in.smoothline.chatterbox.vo.CircleUserProfile;

@Component
public class CircleUserProfileService
{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public String fetchCircleUserProfileService(String userId) {
        String sql = "SELECT * FROM CIRCLE_USER_PROFILE WHERE USER_ID = '" + userId +"'";
        String result = jdbcTemplate.query(sql, new CircleUserProfileRowMapper());
        return result;
    }

    public int createCircleUserProfileService(CircleUserProfile circleUserProfile) {

       /* 
        circleUserProfile.setUserId("vparekh");
        circleUserProfile.setCircleUserId("circleprofile_"+ circleUserProfile.getUserId());
        circleUserProfile.setHomeServer("homeserver1");
        circleUserProfile.setAccessToken("asdfghjkl");
        circleUserProfile.setMobileNumber(1234567890);
        circleUserProfile.setEmailId("asd@asd.com");
        circleUserProfile.setCirclePowerLevel(50);
        circleUserProfile.setProfilePictureUrl("asdsdsdsds.com");
        circleUserProfile.setUserBio("userBiostatus");
        circleUserProfile.setIsActive("Yes");
        circleUserProfile.setCreatedTs("2020-01-26");
        circleUserProfile.setLastModifiedTs("2020-01-26");
        */

        int result = jdbcTemplate.update(
                "INSERT INTO CIRCLE_USER_PROFILE (circle_user_id, user_id, homeserver, access_token, mobile_number, "+
                 "email_id, circle_power_level, profile_picture_url, user_bio, is_active, created_ts, last_modified_ts) "+
                 "VALUES (?,?,?,?,?,?,?,?,?,?,?,? )", circleUserProfile.getCircleUserId(), circleUserProfile.getUserId(),
                 circleUserProfile.getHomeServer(), circleUserProfile.getAccessToken(), circleUserProfile.getMobileNumber(),
                 circleUserProfile.getEmailId(), circleUserProfile.getCirclePowerLevel(), circleUserProfile.getProfilePictureUrl(),
                 circleUserProfile.getUserBio(), circleUserProfile.getIsActive(), circleUserProfile.getCreatedTs(),
                 circleUserProfile.getLastModifiedTs()
            );

        return result;
    }

}