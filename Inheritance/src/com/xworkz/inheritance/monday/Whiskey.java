package com.xworkz.inheritance.monday;

public class Whiskey extends Alcohol {
	public Whiskey() {
		System.out.println("No Args Constructor");
	}

	public Whiskey(String brand) {
		System.out.println("String Constructor in Whiskey");
	}

	public void peg() {
		System.out.println("Running PEG in Whiskey");
	}
}
