package com.xworkz.things;

import com.xworkz.boot.chaining.Place;

public class PlaceRunner {

	public static void main(String[] args) {
		Place place = new Place();
		place.show();
		System.out.println("    ");
		Place place1 = new Place("Mangalore",250000,"Karnataka","India");
		place1.show();

	}

}
