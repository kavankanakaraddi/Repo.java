package com.xworkz.boot;

public class Umbrella {
	public String size;
	public int numbers;
	public double spokes;
	public char brand;
	public float amount;
	public boolean quality;

	public Umbrella(String size,int numbers,double spokes,char brand,float amount,boolean quality)
		{
			this.size=size;
			this.numbers=numbers;
			this.spokes=spokes;
			this.brand=brand;
			this.amount=amount;
			this.quality=quality;
		
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
