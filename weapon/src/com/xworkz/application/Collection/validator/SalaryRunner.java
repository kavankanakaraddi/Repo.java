package com.xworkz.application.Collection.validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class SalaryRunner {

	public static void main(String[] args) {
		Collection<Double> percentages = new ArrayList<>();
		percentages.add(45.5);
		percentages.add(45.8);
		percentages.add(50.1);
		percentages.add(52.25);

		percentages.stream().filter(e -> e < 50).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("************************");
		percentages.stream().filter(e -> e > 50).collect(Collectors.toList()).forEach(e -> System.out.println(e));

	}

}
