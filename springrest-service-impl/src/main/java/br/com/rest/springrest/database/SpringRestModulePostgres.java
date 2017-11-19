package br.com.rest.springrest.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;


@Configuration
public class SpringRestModulePostgres {

	@Value("${spring.datasource.driver-class-name}") private String driverClassName;
	@Value("${spring.datasource.url}") private String urlDatabase;
	@Value("${spring.datasource.username}") private String username;
	@Value("${spring.datasource.password}") private String password;
	
	@Bean	
	public DataSource postgresDataSource() throws SQLException {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(urlDatabase);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
}