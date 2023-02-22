package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {
		Alcohol alcohol = new Alcohol ("MCdowells",500,"Whiskey",45);
		System.out.println(alcohol.toString());
		
		System.out.println(alcohol.equals(alcohol));
		
		Alcohol alcohol2 = new Alcohol ("KingFisher",250,"Beer",8);
		System.out.println(alcohol2.toString());
		
		System.out.println(alcohol.equals(alcohol2));
		

	}

}
