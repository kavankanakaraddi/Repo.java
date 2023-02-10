package com.xworkz.tasks.boot;

public class Area {
	public String name;
	public int popultions;
	public String streat;

	public Area() {
		System.out.println("no args Costructor");
	}

	public Area(String name, int popultions, String streat) {
		this.name = name;
		this.popultions = popultions;
		this.streat = streat;
	}

	public void display() {
		System.out.println("Area name is :" + this.name);
		System.out.println("Populations of this Area :" + this.popultions);
		System.out.println("Streat name is :" + this.streat);
	}

}
