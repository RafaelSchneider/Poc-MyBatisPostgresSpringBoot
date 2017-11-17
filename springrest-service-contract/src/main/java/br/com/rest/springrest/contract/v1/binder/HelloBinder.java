package br.com.rest.springrest.contract.v1.binder;

import br.com.rest.springrest.contract.v1.model.Hello;
import br.com.rest.springrest.model.HelloModel;

public class HelloBinder {

	public HelloBinder() {}

	public Hello bindFromModel() {
		Hello hello = new Hello();
		hello.setId(1L);
		hello.setName("Cevoscleu");
		hello.setLastName("Silvani");
		hello.setMessage("Hello World");
		return hello;
	}

	public Hello bindFromModel(HelloModel helloModel){
		Hello hello = new Hello();
		hello.setId(helloModel.getId());
		hello.setName(helloModel.getName());
		hello.setLastName(helloModel.getLastName());
		hello.setMessage(helloModel.getMessage());
		return hello;
	}
}