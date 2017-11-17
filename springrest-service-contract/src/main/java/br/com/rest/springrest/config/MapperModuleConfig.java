package br.com.rest.springrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.rest.springrest.contract.v1.binder.HelloBinder;


@Configuration
public class MapperModuleConfig {

	@Bean
	public HelloBinder helloBinder() {
		return new HelloBinder();
	}
}