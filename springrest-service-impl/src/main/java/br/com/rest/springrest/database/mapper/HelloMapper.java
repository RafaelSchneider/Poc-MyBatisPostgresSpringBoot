package br.com.rest.springrest.database.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.rest.springrest.model.HelloModel;


public class HelloMapper implements RowMapper<HelloModel> {

	@Override
	public HelloModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		HelloModel helloWorld = new HelloModel();
		helloWorld.setId(rs.getLong("id"));
		helloWorld.setName(rs.getString("name"));
		helloWorld.setLastName(rs.getString("lastname"));
		helloWorld.setMessage(rs.getString("message"));
		return helloWorld;
	}
}