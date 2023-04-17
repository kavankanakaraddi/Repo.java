package com.xworkz.application.Collection.validator;

public class Util {
	public static void test(Hunter hunter) {
		hunter.hunt(39);

	}

	public static void test(Player player) {
	String v=	player.on("Annesh", "Nagaland");
	System.out.println(v);
	}

	public static void test1(Gambler gambler) {
		gambler.lost(2000D);

	}

	public static void test(Shooter shoot) {
		shoot.Shooter("ROCKEY ");
	}

	public static void test2(Run runner) {
		runner.running(2.5D);

	}
	public static void test3 (Eater eater) {
		eater.eat("French Fries",1);
	}

}
