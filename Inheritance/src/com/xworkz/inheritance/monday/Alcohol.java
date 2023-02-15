package com.xworkz.inheritance.monday;

public class Alcohol {
	private String brand;

	public Alcohol() {
		System.out.println("No arg Constructor");
	}

	public Alcohol(String brand) {
		this.brand = brand;
		System.out.println("String Arg onstructor in Alcohol");
	}

	public void bottle() {
		System.out.println("Running Bottle of Alcohol");
	}

	public String getBrand() {
		return brand;
	}
}
