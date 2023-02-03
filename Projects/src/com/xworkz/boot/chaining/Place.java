package com.xworkz.boot.chaining;

public class Place {
	public String placeName;
	public int popoulations;
	public String state;
	public String country;

	public Place() {
		System.out.println("No arg constructor");
	}

	public Place(String placeName) {
		this.placeName = placeName;
		System.out.println(" arg placeName constructor");
	}

	public Place(String placeName, int popoulations) {
		this(placeName);
		this.popoulations = popoulations;
		System.out.println("placeName and popoulations arg constructor");
	}
	public Place(String placeName,int popoulationsn, String state) {
		this(placeName, popoulationsn);
		this.state = state;
		System.out.println("placeName,popoulationsn, state arg constructor");
	}
	public Place(String placeName,int popoulationsn, String state,String country) {
		this(placeName, popoulationsn,state);
		this.country = country;
		System.out.println("placeName,popoulations, state ,country arg constructor");
	}
	public void show() {
		System.out.println("placeName :" + this.placeName);
		System.out.println("popoulationsn :" + this.popoulations);
		System.out.println("state :" + this.state);
		System.out.println("country :" + this.country);
		

	}
	

}
 