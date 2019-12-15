package in.smoothline.chatterbox.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ServiceAdministrationRowMapper implements ResultSetExtractor<String> {

	@Override
	public String extractData(ResultSet rs) throws SQLException, DataAccessException {
		String is_admin = "false";
		while (rs.next()) {
			is_admin = rs.getString("is_admin");
		}
		return is_admin;
	}
}
