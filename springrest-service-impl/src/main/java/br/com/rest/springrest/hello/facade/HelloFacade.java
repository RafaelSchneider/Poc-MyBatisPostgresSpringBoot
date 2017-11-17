package br.com.rest.springrest.hello.facade;

import br.com.rest.springrest.database.HelloServiceDao;
import br.com.rest.springrest.model.HelloModel;

public class HelloFacade {

	private HelloServiceDao helloServiceDao;
	
	public HelloFacade(HelloServiceDao helloServiceDao) {
		this.helloServiceDao = helloServiceDao;
	}
	
	public HelloModel buildHello(Long id) {
		return helloServiceDao.getClient(id);
	}
}