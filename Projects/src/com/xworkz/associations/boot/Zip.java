package com.xworkz.associations.boot;

public class Zip {

	public boolean good;
	public String Brand;
	
	public Zip(boolean good,String Brand) {
		this.good=good;
		this.Brand=Brand;
	}
	public void display() {
		System.out.println("The Quality of this Sweater is Good ::"+this.good);
		System.out.println("The Brand of Sweater is  ::"+this.Brand);
		}
}
