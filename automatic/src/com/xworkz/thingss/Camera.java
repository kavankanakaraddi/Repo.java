package com.xworkz.thingss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Camera {
	
	private String brandName;
	private Guide guide;
	
	@Autowired
	public Camera (String brandName,Guide guide) {
		super();
		this.brandName=brandName;
		this.guide=guide;

	}
	
	
	
	

}
