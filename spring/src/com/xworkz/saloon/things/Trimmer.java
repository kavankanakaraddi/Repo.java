package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {

	private String brand;
	private String colour;
	@Value("1000")
	private int price;
	private double height;

	public Trimmer(@Value("Philips")String brand, @Value("Brown")String colour) {
		super();
		this.brand = brand;
		this.colour = colour;
	}

	@Value("3.56")
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", colour=" + colour + ", price=" + price + ", height=" + height + "]";
	}
	
	

}
