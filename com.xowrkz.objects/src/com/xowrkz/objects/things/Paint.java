package com.xowrkz.objects.things;

public class Paint {
	private String brand;
	private String colour;
	private double price;
	private boolean quality;
	private int quantity;

	public Paint() {
		System.out.println("No Arguments Constr in Paint ");
	}

	public int getQuantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	@Override
	public int hashCode() {
		return 12345;
	}

	@Override
	public String toString() {
		return "Brand::" + this.brand + "  Colour::" + this.colour + "  Price::" + this.colour + "  Quantity::"
				+ this.quantity + "ML" + "  Quality is Good ::" + this.quality;
	}
}
