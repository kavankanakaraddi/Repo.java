package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish fish = new Fish ("Katla","Goa",500,35,true);
		System.out.println(fish.toString());
		
		System.out.println(fish.equals(fish));
		
		Fish fish2 = new Fish ("Pomplet","Goa",500,35,true);
		System.out.println(fish2.toString());
		
		System.out.println(fish.equals(fish2));
	

	}

}
