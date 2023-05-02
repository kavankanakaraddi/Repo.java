package com.xworkz.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringConfiguration ref = con.getBean(SpringConfiguration.class);
		System.out.println(ref.methof());
		System.out.println(ref.method());
		
	}

}
