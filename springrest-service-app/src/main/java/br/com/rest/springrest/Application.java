package br.com.rest.springrest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "br.com.rest")
public class Application {
	
    public static void main(String[] args) {
    	new RestRunner(Application.class).run(args);
    }
}