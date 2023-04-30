package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saloon {

	private String name;
	private String ownerName;
	private String type;
	private String location;
	private int noOfBarbers;

	public Saloon(@Value("Annesh")String name, @Value("Annesh")String ownerName, @Value("Male") String type,  @Value("Rabakhavi")String location, @Value("11") int noOfBarbers) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.location = location;
		this.noOfBarbers = noOfBarbers;
	}

	@Override
	public String toString() {
		return "Saloon [name=" + name + ", ownerName=" + ownerName + ", type=" + type + ", location=" + location
				+ ", noOfBarbers=" + noOfBarbers + "]";
	}

}
