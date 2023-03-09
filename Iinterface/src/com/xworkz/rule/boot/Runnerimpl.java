package com.xworkz.rule.boot;

import com.xworkz.rule.implimentor.Implementor;

public class Runnerimpl {

	public static void main(String[] args) {
		Implementor implimentor = new Implementor();

		String toString = implimentor.toString();
		System.out.println(toString);

		int minAmount = implimentor.minAmount();
		System.out.println(minAmount);

		int stayingAtHotel = implimentor.stayingAtHotel();
		System.out.println(stayingAtHotel);

		int maxDrinksLimits = implimentor.maxDrinksLimits();
		System.out.println(maxDrinksLimits);

		String citizen = implimentor.citizens();
		System.out.println(citizen);

		int records = implimentor.criminalRecords();
		System.out.println(records);

		boolean jail = implimentor.jail();
		System.out.println(jail);

		String standards = implimentor.followStandards();
		System.out.println(standards);

		boolean concept = implimentor.understandingConcepts();
		System.out.println(concept);

	}

}


