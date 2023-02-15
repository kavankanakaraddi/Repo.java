package com.xworkz.inheritance.monday;

public class Device {
	private String brand;
	
	public Device () {
		System.out.println("No Args Constructor");
	}
	public Device (String brand) {
		this.brand=brand;
		System.out.println("String args constr in Device");
	}
	public void operate () {
		System.out.println("Running Operator of Device");
	}
	public String getBrand() {
		return brand;
	}

}
