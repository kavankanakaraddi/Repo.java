package com.xworkz.thingss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString


public class Guide {
	
	
	private String guideName;

	private Security security;
	

	@Autowired
	public Guide( String guideName,Security security) {
		super();
		this.security=security;
		this.guideName=guideName;
	}
	
	

	

}
