package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {
	@Value("cream")
	private String colour;
	private String shape;
	private String type;

	public Chair(@Value("Round") String shape) {
		super();
		this.shape = shape;

	}

	@Value("Wooden")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chair [colour=" + colour + ", shape=" + shape + ", type=" + type + "]";
	}
	
	

}
