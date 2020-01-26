package in.smoothline.chatterbox.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gson.Gson;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import in.smoothline.chatterbox.vo.CircleUserProfile;

public class CircleUserProfileRowMapper implements ResultSetExtractor<String> {

	@Override
	public String extractData(ResultSet rs) throws SQLException, DataAccessException {
        CircleUserProfile cp = new CircleUserProfile();
		while (rs.next()) {
            cp.setCircleUserId(rs.getString("circle_user_id"));
            cp.setUserId(rs.getString("user_id"));
            cp.setHomeServer(rs.getString("homeserver"));
            cp.setAccessToken(rs.getString("access_token"));
            cp.setMobileNumber(rs.getInt("mobile_number"));
            cp.setEmailId(rs.getString("email_id"));
            cp.setCirclePowerLevel(rs.getInt("circle_power_level"));
            cp.setProfilePictureUrl(rs.getString("profile_picture_url"));
            cp.setUserBio(rs.getString("user_bio"));
            cp.setIsActive(rs.getString("is_active"));
            cp.setCreatedTs(rs.getString("created_ts"));
            cp.setLastModifiedTs(rs.getString("last_modified_ts"));
		}
		return new Gson().toJson(cp);
	}
    
}