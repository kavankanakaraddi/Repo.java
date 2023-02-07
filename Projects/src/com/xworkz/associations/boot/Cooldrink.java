package com.xworkz.associations.boot;

public class Cooldrink {
	public boolean cold;
	public double liters;
	
	public Cooldrink(boolean cold,double liters) {
		this.cold=cold;
		this.liters=liters;
	}
	public void display() {
		System.out.println("this is Cold   ::"+this.cold);
		System.out.println("The Fridge Capacity is  ::"+this.liters);
		}
	
	
}
