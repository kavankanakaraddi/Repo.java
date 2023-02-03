package com.xworkz.boot;

public class Frame {
	public String size;
	public int quantity;
	public double ordered;
	public char brand;
	public float amount;
	public boolean quality;
	public String place;

	public Frame(String size,int quantity,double ordered,char brand,float amount,boolean quality,String place)
		{
			this.size=size;
			this.quantity=quantity;
			this.ordered=ordered;
			this.brand=brand;
			this.amount=amount;
			this.quality=quality;
			this.place=place;
		}
	public void display() {
		System.out.println("The Frame size is ::"+size);
		System.out.println("The Frame quantity will be ::"+quantity);
		System.out.println("The Frame ordered is from ::"+ordered);
		System.out.println("The Frame bought from ::"+brand);
		System.out.println("The Frame amount is ::"+amount);
		System.out.println("The quality of Frame is Good ::"+quality);
		System.out.println("The Frame is Kept in "+place);
		
	}	
	
	
}
