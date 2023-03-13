package com.xworkz.GoldSeller;

import com.xworkz.GoldRule.GoldSeller;

public class Malbar implements GoldSeller  {

	public Malbar() {
		System.out.println("Running Malabar with no arg constructor");
	}

	@Override
	public double pricePerGram() {
		return 5200;
	}

	@Override
	public String getGstNo() {
		return "A152S5555S1A";
	}

	@Override
	public String getLocation() {
		return "Tumkur";
	}

}
