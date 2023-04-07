package com.xworkz.application.dto;

import java.io.Serializable;

public class VegetablesDTO implements Serializable {

	private String name;
	private int weight;
	private int price;
	private String location;
	private String region;

	public VegetablesDTO(String name, int weight, int price, String location, String region) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.location = location;
		this.region = region;
	}

	@Override
	public String toString() {
		return "VegetablesDTO [name=" + name + ", weight=" + weight + ", price=" + price + ", location=" + location
				+ ", region=" + region + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	

}
