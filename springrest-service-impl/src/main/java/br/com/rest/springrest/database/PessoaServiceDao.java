package br.com.rest.springrest.database;

import br.com.rest.springrest.model.PessoaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by schneider on 16/11/17.
 */
public class PessoaServiceDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public PessoaModel getPessoaId(Long id){
        try{
            return jdbcTemplate.queryForObject("Select id, nome, idade from pessoas "+
                                               " where id = ? ", new   );

        } catch (Exception e){
            System.out.println("Ocorreu um erro: "+e.getMessage());
        }
    }
}
