package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	
	@Value("realme")
	private String brand;
	@Value("500")
	private int size;
	@Value("600.0")
	private double cost;
	@Value("red")
	private String color;
	@Value("rectangale")
	private String shape;
	@Value("bgk")
	private String place;
	@Value("500")
	private int  charger;
	@Value("realme")
	private String chargerbrand;
	@Value("8296404031")
	private long number;
	@Value("4.5")
	private float ram;
	@Value("new")
	private String version;
	@Value("on")
	private String switchoff;
	@Value("full")
	private String memory;
	@Value("close")
	private String camera;
	
	public String quality () {
		System.out.println("Running Method in Phone ");
		
		return "Good";
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", size=" + size + ", cost=" + cost + ", color=" + color + ", shape=" + shape
				+ ", place=" + place + ", charger=" + charger + ", chargerbrand=" + chargerbrand + ", number=" + number
				+ ", ram=" + ram + ", version=" + version + ", switchoff=" + switchoff + ", memory=" + memory
				+ ", camera=" + camera + "]";
	}
	
	

}
