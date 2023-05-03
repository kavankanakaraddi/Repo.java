package com.xworkz.thingss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class EntryFees {
	
	private int price;
	
	private SensoredDoor sensoredDoor;
	
	@Autowired
	public EntryFees (int price,SensoredDoor sensoredDoor) {
		super();
		this.price=price;
		this.sensoredDoor=sensoredDoor;
		
	}

}
