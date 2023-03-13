package com.xworkz.impl;

import com.xworkz.Delivery.Delivery;

public class Dunzo implements Delivery {

	@Override
	public double charges() {
		System.out.println("Running in Charges of DUNZO.......");
		return 45;
	}

	@Override
	public double timeTaken() {
		System.out.println("Running in Time Taken of DUNZO.......");
		return 50;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Agent Name on Rate Cards.......");
		if(rating==1) {
			return "Basavaraj";
		}
		if(rating==2) {
			return "Dinakar";
		}
		if(rating==3) {
			return "Shivakumar";
		}
		return "DUNZO Delivery Partner is :";
	}

}
