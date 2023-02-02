package com.xworkz.boot;

public class Burger {
	public String size;
	public int quantity;
	public double ordered;
	public char brand;
	public float amount;
	public boolean quality;

	public Burger(String arg1,int arg2,double arg3,char arg4,float arg5,boolean arg6)
		{
			this.size=arg1;
			this.quantity=arg2;
			this.ordered=arg3;
			this.brand=arg4;
			this.amount=arg5;
			this.quality=arg6;
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