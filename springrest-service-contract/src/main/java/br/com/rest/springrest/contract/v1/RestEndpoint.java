package br.com.rest.springrest.contract.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rest.springrest.contract.v1.binder.HelloBinder;
import br.com.rest.springrest.contract.v1.model.Hello;
import br.com.rest.springrest.impl.SpringRestService;

import com.wordnik.swagger.annotations.Api;

@Path("/v1")
@Api(tags = "springrest")
public class RestEndpoint {

	@Context UriInfo uriInfo;
	@Autowired HelloBinder helloBinder;
	@Autowired SpringRestService springRestService;

	@GET
	@Path("/teste")
	@Produces(MediaType.APPLICATION_JSON)
	public String teste() {
		return "Teste aqui";
	}

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Hello hello() {
		return helloBinder.bindFromModel();
	}

	@GET
	@Path("/hello/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Hello hello2(@PathParam("id") Long id) {
		return helloBinder.bindFromModel(springRestService.getHelloModel(id));
	}
}