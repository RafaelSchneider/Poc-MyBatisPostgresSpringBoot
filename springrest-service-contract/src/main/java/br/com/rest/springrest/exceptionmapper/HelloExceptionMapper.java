package br.com.rest.springrest.exceptionmapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import br.com.rest.springrest.exception.HelloException;

public class HelloExceptionMapper implements ExceptionMapper<HelloException>{

	@Override
	public Response toResponse(HelloException exception) {
		return Response.status(Response.Status.BAD_REQUEST).
				entity(exception.getMessage()).
				type(MediaType.TEXT_PLAIN).
				build();
	}
}
