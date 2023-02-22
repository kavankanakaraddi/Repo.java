package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.TV;

public class TVRunner {

	public static void main(String[] args) {
		TV tv = new TV ("LG",50,55);
		System.out.println(tv.toString());
		
		System.out.println(tv.equals(tv));
		
		TV tv2 = new TV ("SAMSUNG",50,55);
		System.out.println(tv2.toString());
		
		System.out.println(tv.equals(tv2));
	}

}
