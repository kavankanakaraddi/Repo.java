package com.xworkz.thingss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Thing {

	@Autowired
	@Qualifier("car")
	private String car;
	/*@Value("1001")
	private int noOfItems;
	@Value("true")
	private boolean strict;*/
	
	
}
