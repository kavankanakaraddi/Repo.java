package com.xworkz.impl;

import com.xworkz.Delivery.Delivery;

public class Rapido implements Delivery{

	@Override
	public double charges() {
		System.out.println("Running in Charges of RAPIDO.......");
		return 60;
	}

	@Override
	public double timeTaken() {
		System.out.println("Running in TimeTaken on RAPIDO.......");
		return 20;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Agent Name on Rate Cards.......");
		if(rating==1) {
			return "Annesh";
		}
		if(rating==2) {
			return "Priyanka";
		}
		if(rating==3) {
			return "Sanketh";
		}
	

		return "Rapido Delivery Partner is :";
	}

}
