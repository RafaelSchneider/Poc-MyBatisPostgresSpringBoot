package br.com.rest.springrest;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class RestRunner {
    private SpringApplicationBuilder applicationBuilder;

    public RestRunner(Class clazz) {
       applicationBuilder = new SpringApplicationBuilder(clazz)
               .profiles("default")
               .properties("server.port:9000")
               .properties("management.contextPath:/monitoring")
               .properties("spring.boot.admin.url:http://localhost:9090")
               .properties("metrics.log.delay:120000")
               .properties("logging.level.de.codecentric.boot.admin.services.ApplicationRegistrator:ERROR");
               //.listeners(new ApplicationPidFileWriter());
    }

    public void run(String[] args){
        applicationBuilder.run(args);
    }

    public SpringApplicationBuilder getApplicationBuilder() {
        return applicationBuilder;
    }
}