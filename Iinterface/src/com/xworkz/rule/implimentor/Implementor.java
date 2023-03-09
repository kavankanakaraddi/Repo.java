package com.xworkz.rule.implimentor;

import com.xworkz.rule.interfaceclass.Developer;

public class Implementor extends AbstractInfo implements PassportRule, DubaiVisaRule, Developer {

	
	public int minAmount() {
		System.out.println("Min Amount : ");
		return 150000;

	}
	public int maxDrinksLimits() {
		System.out.println("maxDrinksLimits : ");
		return 150000;

	}
	public int stayingAtHotel() {
		System.out.println("stayingAtHotel : ");
		return 150000;

	}
	public boolean jail() {
		System.out.println("Jail : ");
		return false;

	}
	public String citizens() {
		System.out.println("Citizen In Implementor : ");
		return "Peoples";
	}
	
	public  int criminalRecords() {
		System.out.println("criminalRecords In Implementor : ");
		return 25;
	}
	
	
	@Override
	public String followStandards() {
		System.out.println("Follow Understand In Implementor : ");
		return null;
	}

	@Override
	public boolean understandingConcepts() {
		System.out.println(" Understanding Concepts In Implementor : ");
		return false;
	}

}
