package com.xworkz.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
	@Bean
	public List <String> methof() {
		
	
	
	List<String> list = new ArrayList<>();
	list.add("kavan");
	list.add("Rakesh");
	
	return list;
	
	}
	@Bean
	public List <String> method() {
		
	
	
	List<String> list = new LinkedList<>();
	list.add("Annesh");
	list.add("Priyanka");
	
	return list;
	
	}

}
