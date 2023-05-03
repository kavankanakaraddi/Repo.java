package com.xworkz.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringConfiguration ref = con.getBean(SpringConfiguration.class);
		System.out.println("ArrayList is Under process");

		System.out.println(ref.methof());
		
		System.out.println("LinkedList is Under process");

		System.out.println(ref.method());
		
		System.out.println("Hashset is Under process");

		
		System.out.println(ref.match());
		
		System.out.println("LinkedHashSet is Under process");

		System.out.println(ref.team());
		
		System.out.println("Tree is Under process");

		System.out.println(ref.cars());



		
	}

}
