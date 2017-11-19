package br.com.rest.springrest.contract.v1.binder;

import br.com.rest.springrest.contract.v1.model.Pessoa;
import br.com.rest.springrest.model.PessoaModel;

/**
 * Created by schneider on 19/11/17.
 */
public class PessoaBinder {

    public PessoaBinder(){}

    public Pessoa bindFromModel(PessoaModel pessoaModel){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(pessoaModel.getId());
        pessoa.setNome(pessoaModel.getNome());
        pessoa.setIdade(pessoaModel.getIdade());
        return pessoa;

    }
}
