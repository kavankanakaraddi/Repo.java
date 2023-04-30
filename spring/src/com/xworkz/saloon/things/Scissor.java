package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Scissor {

	private String type;
	@Value("40.05")
	private double weight;
	private String colour;

	public Scissor(@Value("Metal") String type) {
		super();
		this.type = type;
	}
	@Value("Red")
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Scissor [type=" + type + ", weight=" + weight + ", colour=" + colour + "]";
	}
	

}
