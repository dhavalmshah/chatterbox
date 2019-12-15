package in.smoothline.chatterbox.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;



@Component
@PropertySource("classpath:application.properties")
public class DBConfig {
//
//	//@Value("${spring.datasource.url}")
//	public static final String url = "jdbc:mysql://localhost:3306/chatterbox_test_api";
//	
//	//@Value("${spring.datasource.username}")
//	public static final String user = "root";
//	
//	//@Value("${spring.datasource.password}")
//	public static final String pass = "root";
//	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//	    return new PropertySourcesPlaceholderConfigurer();
//	}
//	/**
//	 * Get a connection to database
//	 * 
//	 * @return Connection object
//	 * @throws ClassNotFoundException 
//	 */
//	public Connection getConnection() {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			return DriverManager.getConnection(url, user, pass);
//		} catch (SQLException | ClassNotFoundException ex) {
//			throw new RuntimeException("Error connecting to the database", ex);
//		}
//	}

}
