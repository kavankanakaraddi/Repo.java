package com.xworkz.boot;

public class Frenchfry {

	public String name;
	public int pieces;
	public double price;
	public String origin;
	public int timeTaken;
	public String preparedBy;
	public char brand;
	public boolean taste;
	public String flavour;
	public String madeBy;
	public float Age;
	
	public void show () {	
		System.out.println(" FrenchFry no arguments constructor");
	}
	public Frenchfry (String arg1){
		name=arg1;
		System.out.println("The Name of the Fries :"+arg1);
	}
	public Frenchfry(int arg1) {
		pieces=arg1;
		System.out.println("The Fries pieces are: "+arg1);
	}
	public Frenchfry(double arg1) {
		price=arg1;
		System.out.println("The price for the Fries is : :"+arg1);	
	}
	public Frenchfry(String arg1,double arg2){
		name = arg1;
		price = arg2;
		System.out.println("The Name for the Fries is : :"+arg1);	
		System.out.println("The price for the Fries is : :"+arg2 );
	}
	public Frenchfry(String arg1,double arg2,int arg3){
		name = arg1;
		price = arg2;
		pieces = arg3;
		System.out.println("The Name for the Fries is : :"+arg1);	
		System.out.println("The price for the Fries is : :"+arg2 );
		System.out.println("The pieces in the Fries are : :"+arg3 );
	}
	public Frenchfry (boolean arg3){
		taste=arg3;
		System.out.println("The Taste of the fries are Good :"+arg3);
	}
	public Frenchfry (String arg5,float arg6) {
		madeBy=arg5;
		Age=55;
		System.out.println("The chef is "+arg5);
		System.out.println("The chef Experience is "+arg6+"  years");
	}
}