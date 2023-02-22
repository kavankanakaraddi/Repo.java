package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Chiefminister;


public class ChiefministerRunner {

	public static void main(String[] args) {
		Chiefminister chiefminister = new Chiefminister("Karnatak","Basavaraj Bommai",55,5,50,"GOVT",3,44,"BE","Shiggoan",true,120);
		System.out.println(chiefminister.toString());

		System.out.println(chiefminister.equals(chiefminister));

		Chiefminister chiefminister2 = new Chiefminister("Karnatak","Basavaraj Bommai",55,5,50,"GOVT",3,44,"BE","Shiggoan",true,120);
		System.out.println(chiefminister2.toString());

		System.out.println(chiefminister.equals(chiefminister2));

	}

}
