package com.xworkz.inheritance.monday;

public class AlchoholRunner {

	public static void main(String[] args) {
		Whiskey whiskey = new Whiskey();
		whiskey.bottle();
		whiskey.peg();
		whiskey.getBrand();
		
		Alcohol alcohol = new Alcohol();
		alcohol.bottle();
		alcohol.getBrand();
		
		Whiskey glass = (Whiskey)alcohol;
		glass.bottle();
		
		
	}

}
