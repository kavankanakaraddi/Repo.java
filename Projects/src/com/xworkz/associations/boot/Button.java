package com.xworkz.associations.boot;

public class Button {

	public String brand;
	public int noOfButtons;
	public boolean quality;

	public void init(String brand, int noOfButtons, boolean quality) {
	
		this.brand = brand;
		this.noOfButtons = noOfButtons;
		this.quality = quality;
	}

	public void display() {
		System.out.println("The Camera Name is ::"+brand);
		System.out.println("The Camera Price is ::"+noOfButtons);
		System.out.println("The Camera  is Good  ::"+quality);
	
	}
}