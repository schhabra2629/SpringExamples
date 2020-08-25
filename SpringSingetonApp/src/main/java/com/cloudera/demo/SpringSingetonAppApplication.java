package com.cloudera.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringSingetonAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringSingetonAppApplication.class, args);
		Car car=context.getBean(Car.class);
		car.show();
		Car car1=context.getBean(Car.class);
		car1.show();
		
	}

}
	