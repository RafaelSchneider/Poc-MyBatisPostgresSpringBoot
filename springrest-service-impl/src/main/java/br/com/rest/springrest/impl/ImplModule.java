package br.com.rest.springrest.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.rest.springrest.database.HelloServiceDao;
import br.com.rest.springrest.hello.facade.HelloFacade;

@Configuration
public class ImplModule {

	@Bean
	public SpringRestService springRestService(){
		return new SpringRestService(helloFacade());
	}

	@Bean
	public HelloFacade helloFacade() {
		return new HelloFacade(helloServiceDao());
	}
	
	@Bean
	public HelloServiceDao helloServiceDao(){
		return new HelloServiceDao();
	}
}