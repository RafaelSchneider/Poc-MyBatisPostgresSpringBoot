package br.com.rest.springrest.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import br.com.rest.springrest.database.mapper.HelloMapper;
import br.com.rest.springrest.exception.HelloException;
import br.com.rest.springrest.model.HelloModel;

public class HelloServiceDao {
	
	@Autowired JdbcTemplate jdbcTemplate;
	
	public HelloModel getClient (Long id){
		try {
			return jdbcTemplate.queryForObject( " select id, name, lastname, message " 
											  + " from hello where id = ?", new HelloMapper(),new Object[]{id} );
		} catch (Exception e) {
			throw new HelloException("Not Found hello!");
		}
	}
}