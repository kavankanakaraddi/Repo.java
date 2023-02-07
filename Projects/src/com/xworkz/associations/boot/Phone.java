package com.xworkz.associations.boot;

public class Phone {

	public String name;
	public int price;
	public boolean good;
	public Camera cc=new Camera();
	
	
	
	public void init(String name, int price, boolean good) {
		
		this.name = name;
		this.price = price;
		this.good = good;
	}
	
	public void display() {
		System.out.println("The phone Name is ::"+name);
		System.out.println("The phone Price is ::"+price);
		System.out.println("The phone  is Good  ::"+name);
		System.out.println("***************************"+ "");

		this.cc.display();


	}
	
	
	
}
