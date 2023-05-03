package com.xworkz.thingss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class SensoredDoor {
	
	
	private int noOfDoors;
	private Camera camera;
	
	@Autowired
	public SensoredDoor(int noOfDoors,Camera camera ) {
		super();

		this.camera=camera;
		this.noOfDoors=noOfDoors;
	}
	
	

}
