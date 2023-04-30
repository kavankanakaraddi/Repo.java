package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {

	private String brand;
	@Value("Hand DRyer")
	private String type;
	private String colour;
	@Value("100.00")
	private double weight;
	private int rpm;

	public HairDryer(@Value("Nova") String brand, @Value("White") String colour) {
		super();
		this.brand = brand;
		this.colour = colour;
	}

	@Value("1200")
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", colour=" + colour + ", weight=" + weight + ", rpm="
				+ rpm + "]";
	}

}
