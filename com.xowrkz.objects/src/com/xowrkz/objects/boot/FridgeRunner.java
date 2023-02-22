package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {
		Fridge fridge = new Fridge ("LG",2,40,true,5,15);
		System.out.println(fridge.toString());
		
		System.out.println(fridge.equals(fridge));
		
		Fridge fridge2 = new Fridge ("WhirlPool",2,40,true,5,15);
		System.out.println(fridge2.toString());
		
		System.out.println(fridge.equals(fridge2));
	}

}
