package com.xowrkz.objects.things;

public class Sugarcane {
	private String name;
	private int breed;
	private double price;
	private boolean Taste;

	public Sugarcane() {
		System.out.println("No Args Constr in Sugarcane");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(int breed) {
		this.breed = breed;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTaste(boolean taste) {
		Taste = taste;
	}
	@Override
	public int hashCode() {
		return 86;
	}
	@Override
	public String toString() {
		return "Name::"+this.name+" Breed::"+this.breed+" Price::"+this.price+" Sweet ::"+this.Taste;
	}
}
