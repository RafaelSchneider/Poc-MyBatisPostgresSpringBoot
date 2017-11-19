package br.com.rest.springrest.impl;

import br.com.rest.springrest.hello.facade.HelloFacade;
import br.com.rest.springrest.model.HelloModel;
import br.com.rest.springrest.model.PessoaModel;
import br.com.rest.springrest.pessoa.facade.PessoaFacade;

public class SpringRestService {

	private HelloFacade helloFacade;
	private PessoaFacade pessoaFacade;

	public SpringRestService(HelloFacade helloMapper) {
		this.helloFacade = helloMapper;
	}

	public HelloModel getHelloModel(Long id) {
		return helloFacade.buildHello(id);
	}

	public PessoaModel getPessoaModel(Long id) { return pessoaFacade.buildPessoa(id);}
}