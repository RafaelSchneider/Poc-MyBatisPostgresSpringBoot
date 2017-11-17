package br.com.rest.springrest.database.mapper;

import br.com.rest.springrest.model.PessoaModel;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by schneider on 16/11/17.
 */
public class PessoaMapper implements RowMapper<PessoaModel> {

    @Override
    public PessoaModel mapRow(ResultSet rs, int rowNum) throws SQLException{
        PessoaModel pessoa = new PessoaModel();
        pessoa.setId(rs.getLong("id"));
        pessoa.setNome(rs.getString("nome"));
        pessoa.setIdade(rs.getInt("idade"));
        return pessoa;

    }
}
