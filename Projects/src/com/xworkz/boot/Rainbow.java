package com.xworkz.boot;

public class Rainbow {
	public boolean natural;
	public int  noOfColour;
	public int time;
	public String rareRainbow;
	public double seen;
	public String olderColour;
	public String place;
	
	public Rainbow(int noOfColour,boolean natural, int time,String rareRainbow, double seen,String olderColour,String place) {
		this.natural=natural;
		this.noOfColour=noOfColour;
		this.time=time;
		this.rareRainbow=rareRainbow;
		this.seen=seen;
		this.olderColour=olderColour;
		this.place=place;
	}
	
	public void display() {
		System.out.println("The noOfColour ::"+noOfColour);
		System.out.println("The Rainbow is natural ::"+natural);
		System.out.println("The time is at "+time);
		System.out.println("The rareRainbow"+rareRainbow);
		System.out.println("The seen"+seen);
		System.out.println("The olderColour  ::"+olderColour);
		System.out.println("The rainbow seen in ::"+place);
	}	
	
	}
