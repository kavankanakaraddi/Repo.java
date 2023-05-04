package com.xworkz.springConfiguration;

import javax.validation.Validation;

import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class ShoeShowRoomSpringConfiguration {
	
	public ShoeShowRoomSpringConfiguration() {
		// TODO Auto-generated constructor stub
	}
	@Bean
	public Validator validator() {
		System.out.println("Registering validator");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;

	}

}
