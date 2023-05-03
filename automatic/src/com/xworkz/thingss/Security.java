package com.xworkz.thingss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString

public class Security {
	
	private String incharge;
	private Thing thing;
	
	@Autowired
	public Security(@Qualifier("name") String incharge,Thing thing) {
		super();
		this.thing = thing;
		this.incharge=incharge;
	}

}
