package com.xworkz.inheritance.monday;

public class Sport {
	private String type;
	public Sport () {
		System.out.println("No Arg Constr in Sport");
	}
	public void play () {
		System.out.println("Play in Sport");
	}
	public String getType() {
		return type;
	}

}
