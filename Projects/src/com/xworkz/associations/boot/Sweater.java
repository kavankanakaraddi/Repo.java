package com.xworkz.associations.boot;

public class Sweater {
	public String name;
	public int noOfPockets;
	public Zip zip;
	
	public void init(Zip zip) {
		this.zip = zip;
	}

	
	public Sweater (String name,int noOfPockets) {
		this.name=name;
		this.noOfPockets=noOfPockets;
		}
	public void display() {
		System.out.println("Sweater Name is  ::" + this.name);
		System.out.println("The noOfPockets for this Sweater   ::" + this.noOfPockets);
		if (zip!= null )
		{
			this.zip.display();
		}
		else 
		{
			System.err.println("Sun is not pointed to any address");
		}
	
	
	}
}
