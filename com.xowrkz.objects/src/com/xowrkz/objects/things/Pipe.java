package com.xowrkz.objects.things;

public class Pipe {

	private String brand;
	private int diameter;
	private double price;
	private String colour;

	public Pipe() {
		System.out.println("No Args in Constructor");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public int hashCode() {
		return 767678;
	}
	@Override
	public String toString() {
		return "Brand::"+this.brand+"  Price::"+this.price+"  Colour::"+this.colour+"  Diameter::"+this.diameter;
	}

}
