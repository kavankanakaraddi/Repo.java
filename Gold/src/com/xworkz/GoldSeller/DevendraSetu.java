package com.xworkz.GoldSeller;

import com.xworkz.GoldRule.GoldSeller;

public class DevendraSetu implements GoldSeller {
	public DevendraSetu() {
		System.out.println("Running DevendraSetu with no arg constructor");
	}

	@Override
	public double pricePerGram() {
		return 4800;
	}

	@Override
	public String getGstNo() {
		return "AHSJS255268DDF";
	}

	@Override
	public String getLocation() {
		return "Bagalkot";
	}

}
