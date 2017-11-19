package br.com.rest.springrest.pessoa.facade;

import br.com.rest.springrest.database.PessoaServiceDao;
import br.com.rest.springrest.model.PessoaModel;

import java.sql.SQLException;

/**
 * Created by schneider on 19/11/17.
 */
public class PessoaFacade {

    private PessoaServiceDao pessoaServiceDao;

    public PessoaFacade ( PessoaServiceDao pessoaServiceDao) {
        this.pessoaServiceDao = pessoaServiceDao;
    }

    public PessoaModel buildPessoa(Long id ){

        //try {
            return pessoaServiceDao.getPessoaId(id);
       // } catch (SQLException e) {
       //     e.printStackTrace();
       // }

    }
}
