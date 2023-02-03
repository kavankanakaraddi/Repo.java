package com.xworkz.things.chainingRunner;

import com.xworkz.boot.chaining.Park;

public class ParkRunner {

	public static void main(String[] args) {
		Park park = new Park();
		park.show();
		System.out.println("    ");
		Park park1 = new Park("Netaji Park",5,9.0d,false,"Yes",15f);
		park1.show();
	}

}
