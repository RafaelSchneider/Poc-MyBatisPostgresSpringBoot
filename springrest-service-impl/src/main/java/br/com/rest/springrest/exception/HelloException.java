package br.com.rest.springrest.exception;

public class HelloException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public HelloException(String message){
		super(message);
	}
}