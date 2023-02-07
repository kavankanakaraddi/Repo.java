package com.xworkz.associations.boot;

public class Shirt {
	public String brand;
	public int price;
	public boolean sleeves;
	public Button bb = new Button();
	
	public void init(String brand, int price, boolean sleeves) {
		this.brand = brand;
		this.price = price;
		this.sleeves = sleeves;
	}
	

	public void display() {
		System.out.println("The Shirt Brand is ::"+brand);
		System.out.println("The Shirt Price is ::"+price);
		System.out.println("The Shirt  is Good  ::"+sleeves);
		System.out.println("***************************"+ "");

		this.bb.display();
	}
}