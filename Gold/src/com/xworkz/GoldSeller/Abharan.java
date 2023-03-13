package com.xworkz.GoldSeller;

import com.xworkz.GoldRule.GoldSeller;

public class Abharan implements GoldSeller {
	public Abharan() {
		System.out.println("Running Abharana with no arg constructor");
	}

	@Override
	public double pricePerGram() {
		return 6000;
	}

	@Override
	public String getGstNo() {
		return "551HDD54D";
	}

	@Override
	public String getLocation() {
		return "Mudhol";
	}


}
