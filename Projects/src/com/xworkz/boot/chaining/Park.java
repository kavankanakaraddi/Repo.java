package com.xworkz.boot.chaining;

public class Park {

	public String name;
	public int open;
	public double closes;
	public boolean good;
	public String parkingFacility;
	public float entryFees;
	
	public Park () {
		System.out.println("No arg constructor");
	}
	public Park (String name) {
		this.name=name;
		System.out.println(" arg name constructor");
	}
	public Park (String name,int open) {
		this(name);
		this.open=open;
		System.out.println("Name and opens @ arg constructor");
	}
	public Park(String name,int open,double closes) {
		this(name,open);
		this.closes=closes;
		System.out.println("Name //opens @ //closes @ arg constructor");
	}
	public Park(String name,int open,double closes, boolean good) {
		this(name,open,closes);
		this.good=good;
		System.out.println("Name //opens @ //closes @ arg // Good constructor");
	}
	public Park(String name,int open,double closes, boolean good,String parkingFacility) {
		this(name,open,closes,good);
		this.parkingFacility=parkingFacility;
		System.out.println("Name //opens @ //closes @ arg // Good  //parkingFacility  //constructor");
	}
	public Park(String name,int open,double closes, boolean good,String parkingFacility,float entryFees) {
		this(name,open,closes,good,parkingFacility);
		this.entryFees=entryFees ;
		System.out.println("Name //opens @ //closes @ arg // Good  //parkingFacility  // EntrFees // constructor");
	}
	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("OpenAt :" + this.open);
		System.out.println("Good :" + this.good);
		System.out.println("Fees :" + this.entryFees);
		System.out.println("ClosesAt:"+this.closes);
		System.out.println("parkingFacility:"+this.parkingFacility);
		

	}
	
	
	
	
	
	
}
