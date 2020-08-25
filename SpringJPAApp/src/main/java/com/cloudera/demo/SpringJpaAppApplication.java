package com.cloudera.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication 
@EnableSwagger2
@ComponentScan("com.cloudera.demo")
public class SpringJpaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAppApplication.class, args);
		
	}

}
