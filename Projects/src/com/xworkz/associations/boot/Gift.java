package com.xworkz.associations.boot;

public class Gift {

	public String name;
	public int noOfItems;
	public Box box;
	
	public void init(Box box) {
		this.box = box;
	}

	
	public Gift (String name,int noOfItems) {
		this.name=name;
		this.noOfItems=noOfItems;
		}
	public void display() {
		System.out.println("Gift Name is  ::" + this.name);
		System.out.println("The noOfItems for this Gift   ::" + this.noOfItems);
		if (box!= null )
		{
			this.box.display();
		}
		else 
		{
			System.err.println("Sun is not pointed to any address");
		}
	
	
	}
}