package com.xworkz.boot;

public class Rainbow {
	public boolean natural;
	public int  noOfColour;
	public int time;
	public String rareRainbow;
	public double seen;
	public String olderColour;
	public String place;
	
	public Rainbow(int arg1,boolean arg2, int arg3,String arg4, double arg5,String arg6,String arg7) {
		this.natural=arg2;
		this.noOfColour=arg1;
		this.time=arg3;
		this.rareRainbow=arg4;
		this.seen=arg5;
		this.olderColour=arg6;
		this.place=arg7;
	}
	
	public void display() {
		System.out.println("The noOfColour"+noOfColour);
		System.out.println("The Rainbow is natural ::"+natural);
		System.out.println("The time is at "+time);
		System.out.println("The rareRainbow"+rareRainbow);
		System.out.println("The seen"+seen);
		System.out.println("The olderColour  ::"+olderColour);
		System.out.println("The rainbow seen in ::"+place);
	}	
	
	}
