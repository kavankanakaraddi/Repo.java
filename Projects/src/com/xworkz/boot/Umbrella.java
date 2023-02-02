package com.xworkz.boot;

public class Umbrella {
	public String size;
	public int numbers;
	public double spokes;
	public char brand;
	public float amount;
	public boolean quality;

	public Umbrella(String arg1,int arg2,double arg3,char arg4,float arg5,boolean arg6)
		{
			this.size=arg1;
			this.numbers=arg2;
			this.spokes=arg3;
			this.brand=arg4;
			this.amount=arg5;
			this.quality=arg6;
		
		}
	public void display() {
		System.out.println("The size is ::"+size);
		System.out.println("The numbers ::"+numbers);
		System.out.println("The spokes are "+spokes);
		System.out.println("The brand is ::"+brand);
		System.out.println("The amount is ::"+amount);
		System.out.println("The quality is ::"+quality);
		
	}	
}
