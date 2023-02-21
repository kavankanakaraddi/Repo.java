package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Sugarcane;

public class SugarcaneRunner {

	public static void main(String[] args) {
		Sugarcane sugarcane = new Sugarcane();
		sugarcane.setBreed(86);
		sugarcane.setName("Sathara");
		sugarcane.setPrice(3500);
		sugarcane.setTaste(true);
		System.out.println(sugarcane);
	}

}
