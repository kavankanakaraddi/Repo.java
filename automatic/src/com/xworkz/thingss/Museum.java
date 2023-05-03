package com.xworkz.thingss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Museum {
	
	private String museumName;
	
	private EntryFees entryFees ;
	
	@Autowired
	public Museum (String museumName,EntryFees entryFees) {
		super();
		this.entryFees=entryFees;
		this.museumName=museumName;
		
	}

}
