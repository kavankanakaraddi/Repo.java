package com.xworkz.boot;

public class Burger {
	public String size;
	public int quantity;
	public double ordered;
	public char brand;
	public float amount;
	public boolean quality;

	public Burger(String size,int quantity,double ordered,char brand,float amount,boolean quality)
		{
			this.size=size;
			this.quantity=quantity;
			this.ordered=ordered;
			this.brand=brand;
			this.amount=amount;
			this.quality=quality;
		}
	public void display() {
		System.out.println("The Burger size is ::"+size);
		System.out.println("The Burger  quantity will be ::"+quantity);
		System.out.println("The Burger ordered is from ::"+ordered);
		System.out.println("The Burger bought from ::"+brand);
		System.out.println("The Burger amount is ::"+amount);
		System.out.println("The quality of Burger is Good ::"+quality);
		
	}	
}