package com.xworkz.boot;

public class Frame {
	public String size;
	public int quantity;
	public double ordered;
	public char brand;
	public float amount;
	public boolean quality;
	public String place;

	public Frame(String arg1,int arg2,double arg3,char arg4,float arg5,boolean arg6,String arg7)
		{
			this.size=arg1;
			this.quantity=arg2;
			this.ordered=arg3;
			this.brand=arg4;
			this.amount=arg5;
			this.quality=arg6;
			this.place=arg7;
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
