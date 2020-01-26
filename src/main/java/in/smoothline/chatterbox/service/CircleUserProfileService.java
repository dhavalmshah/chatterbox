package in.smoothline.chatterbox.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import in.smoothline.chatterbox.rowmapper.CircleUserProfileRowMapper;

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

}