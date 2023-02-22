package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Waterfall;

public class WaterfallRunner {

	public static void main(String[] args) {
		Waterfall waterfall = new Waterfall ("JogFalls",1100,"Shivmogga");
		System.out.println(waterfall.toString());
		
		System.out.println(waterfall.equals(waterfall));
		
		Waterfall waterfall2 = new Waterfall ("Magod",25,"Sirsi");
		System.out.println(waterfall.toString());
		
		System.out.println(waterfall.equals(waterfall2));
		
	}

}
