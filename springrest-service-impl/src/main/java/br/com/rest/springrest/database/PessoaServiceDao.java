package br.com.rest.springrest.database;

import br.com.rest.springrest.database.mapper.PessoaMapper;
import br.com.rest.springrest.model.PessoaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * Created by schneider on 16/11/17.
 */
public class PessoaServiceDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public PessoaModel getPessoaId(Long id) throws SQLException{
        try{
            return jdbcTemplate.queryForObject("Select id, nome, idade from pessoas "+
                                               " where id = ? ", new PessoaMapper(), new Object[]{id} );

        } catch (Exception e){
                System.out.println("Ocorreu um erro: "+e.getMessage());
                return new PessoaModel(); //corrigir
        }

    }
}
