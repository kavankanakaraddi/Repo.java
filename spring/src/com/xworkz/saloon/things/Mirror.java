package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mirror {

	@Value("4.5")
	private double height;
	private String shape;
	private double weight;

	public Mirror(@Value("Round ") String shape) {
		super();
		this.shape = shape;
	}

	@Value("3.5 ")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mirror [height=" + height + ", shape=" + shape + ", weight=" + weight + "]";
	}
	

}
