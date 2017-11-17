package br.com.rest.springrest.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

import br.com.rest.springrest.contract.v1.RestEndpoint;
import br.com.rest.springrest.exceptionmapper.HelloExceptionMapper;

@Component
@ApplicationPath("springrest")
public class JerseyConfig  extends ResourceConfig {

    public JerseyConfig() {
        packages("com.wordnik.swagger.jaxrs.json");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
        register(RestEndpoint.class);
        register(HelloExceptionMapper.class);
    }
}