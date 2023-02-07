package com.xworkz.associations.boot;

public class Fridge {


	public String name;
	public int noOfDoors;
	public Cooldrink cooldrink;
	
	public void init(Cooldrink cooldrink) {
		this.cooldrink = cooldrink;
	}

	
	public Fridge (String name,int noOfDoors) {
		this.name=name;
		this.noOfDoors=noOfDoors;
		}
	public void display() {
		System.out.println("Fridge Name is  ::" + this.name);
		System.out.println("The noOfDoors for this fridge   ::" + this.noOfDoors);
		if (cooldrink!= null )
		{
			this.cooldrink.display();
		}
		else 
		{
			System.err.println("Sun is not pointed to any address");
		}
	
	
	}
}
