package com.xworkz.boot;

public class Biryani {
	
	public String type;
	public int quantity;
	public float plates;
	public double price;
	public double calories;
	public boolean taste;
	public char brand ;
	
	
	public void display ( ) {
		System.out.println("biryani with no args constructor");
	}
	public Biryani (String arg1) {
		type=arg1;
		System.out.println("The Biryani is ::"+arg1+" Biryani");
	}
	public Biryani (int arg1) {
		quantity=arg1;
		System.out.println("The no of Biryani's are ::"+arg1+" Biryani");
	}
	public Biryani (float arg1) {
		plates=arg1;
		System.out.println("The no of plates are ::"+arg1+" Biryani");
	}	
	public Biryani (double arg2) {
		price=arg2;
		System.out.println("The Biryani price is ::"+arg2);
	}
	public Biryani (boolean arg1) {
		taste=arg1;
		System.out.println("The Biryani Taste is Good ::"+arg1);
	}
	public Biryani (char arg1) {
		brand=arg1;
		System.out.println("The Biryani Brand is Good ::"+arg1);
	}
	public Biryani (String arg1,int arg2) {
		type=arg1;
		quantity=arg2;
		System.out.println("The Biryani is ::"+arg1+" Biryani");
		System.out.println("The no of Biryani's are ::"+arg2+" Biryani");
	}
	
	
}
