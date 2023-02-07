package com.xworkz.associations.boot;

public class Box {

	public boolean good;
	public double noOfPens;
	
	public Box(boolean good,double noOfPens) {
		this.good=good;
		this.noOfPens=noOfPens;
	}
	public void display() {
		System.out.println("Gift is Good  ::"+this.good);
		System.out.println("The No of Pens is  ::"+this.noOfPens);
		}
}
