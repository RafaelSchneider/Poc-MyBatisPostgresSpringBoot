package br.com.rest.springrest.impl;

import br.com.rest.springrest.hello.facade.HelloFacade;
import br.com.rest.springrest.model.HelloModel;

public class SpringRestService {

	private HelloFacade helloFacade;

	public SpringRestService(HelloFacade helloMapper) {
		this.helloFacade = helloMapper;
	}

	public HelloModel getHelloModel(Long id) {
		return helloFacade.buildHello(id);
	}
}