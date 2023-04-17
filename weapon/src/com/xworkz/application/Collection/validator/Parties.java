package com.xworkz.application.Collection.validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Parties {

	public static void main(String[] args) {
		
		Collection<String > parties = new ArrayList<>();
		parties.add("Bharatiya Janatha Party");
		parties.add("aap");
		parties.add("upp");
		parties.add("KRpp");
		
		
		parties.stream().map(element->element.toUpperCase()).collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		System.out.println("**********************************************************");
		
		parties.stream().map(element1->element1.toLowerCase()).collect(Collectors.toList()).forEach(ref1->System.out.println(ref1));
	}

}
