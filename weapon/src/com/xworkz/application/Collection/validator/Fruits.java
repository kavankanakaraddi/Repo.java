package com.xworkz.application.Collection.validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Fruits {

	public static void main(String[] args) {

		Collection<String> fruit = new ArrayList<>();
		fruit.add("Banana");
		fruit.add("Musk-Melon");
		fruit.add("Watermelon");
		fruit.add("pappaya");
		fruit.add("Raspberry");
		fruit.add("Grapes");
		fruit.add("Mango");
		fruit.add("Kiwi");
		fruit.add("Guvva");
		fruit.add("ButterFruit");
		fruit.add("Apple");
		fruit.add("water Apple");
		fruit.add("Green Apple");
		fruit.add("Sitaphal");
		fruit.add("Jack Fruit");
		fruit.add("BlueeBerry");
		fruit.add("custordApple");
		fruit.add("Dragon Fruit");
		fruit.add("lemon");
		fruit.add("GoosBerry");
		fruit.add("orange");
		fruit.add("pineaplle");
		fruit.add("StrawBerry");
		fruit.add("Pomo");
		fruit.add("Chikku");

		System.out.println("Total::" + fruit.size());
		System.out.println("********************************");

		System.out.println("Fruit Names in Upper case");

		fruit.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("********************************");
		System.out.println("Fruit Names in Lowe case");

		fruit.stream().map(e -> e.toLowerCase()).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("********************************");

		fruit.stream().filter(e -> e.length() < 7).collect(Collectors.toList()).forEach(e -> System.out.println(e));

		int count = fruit.stream().filter(e -> e.length() < 7).collect(Collectors.toList()).size();
		System.out.println("********************************");

		System.out.println("The Count is :: " + count);

	}

}
