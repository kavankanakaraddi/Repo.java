package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShavingCream {

	@Value("SpiceJet")
	private String brand;
	private int price;
	private int quantity;

	public ShavingCream(@Value("35") int price) {
		super();
		this.price = price;
	}
	@Value("4")
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	 

}
