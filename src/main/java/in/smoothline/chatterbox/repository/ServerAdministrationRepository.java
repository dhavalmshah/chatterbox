package in.smoothline.chatterbox.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.smoothline.chatterbox.rowmapper.ServiceAdministrationRowMapper;

@Repository
public class ServerAdministrationRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String isAdmin(String access_token) {
		String result = "false";
		String sql = "select case when t1.admin = 1 then 'true' else 'false' end as is_admin from users t1 join access_tokens t2  on t1.name = t2.user_id  where t2.token ='"+access_token+"'";
		result = jdbcTemplate.query(sql, new ServiceAdministrationRowMapper());
		return (result);
	}
}
