package com.xworkz.associations.boot;

public class Sunrise {

	public String name;
	public int rises;
	public Sun sun;
	
	public void init(Sun sun) {
		this.sun = sun;
	}

	
	public Sunrise (String name,int rises) {
		this.name=name;
		this.rises=rises;
		}
	public void display() {
		System.out.println("Name is ::" + this.name);
		System.out.println("The Sun Rises at  ::" + this.rises);
		if (sun!= null )
		{
			this.sun.display();
		}
		else 
		{
			System.err.println("Sun is not pointed to any address");
		}
	
	
	}
	
	
}
