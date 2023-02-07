package com.xworkz.associations.boot;

public class Camera {
	public String name;
	public  int price ;
	public double pixels;
	
	
	public void init (String name, int price, double pixels) {
		
		this.name = name;
		this.price = price;
		this.pixels = pixels;
	}
	public void display() {
		System.out.println("The Camera Name is ::"+name);
		System.out.println("The Camera Price is ::"+price);
		System.out.println("The Camera  is Good  ::"+pixels);


	}
	
	
	
	
	
	

}
