package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {
		Coconut coconut = new Coconut();
		coconut.setGood(true);
		coconut.setOrigin("Arasikere");
		coconut.setPrice(25);
		coconut.setQuantity(50);
		System.out.println(coconut);

	}

}
