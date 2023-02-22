package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		Cake cake = new Cake ("StrawBerry",2.0d,"Round",550);
		System.out.println(cake.toString());
		
		System.out.println(cake.equals(cake));
		
		Cake cake2 = new Cake ("ButterScotch",2.0d,"Square",800);
		System.out.println(cake.toString());
		
		System.out.println(cake.equals(cake2));
		
	}

}
