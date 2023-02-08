package com.xworkz.setter.boot;

public class Scientists {
	public String name;
	public String designation;

	public void setname (String name) {
		this.name=name;
	}
	public void setdesignation( String designation) {
		this.designation=designation;
	}
	public void display () {
		System.out.println("The Name"+this.name);
		System.out.println("the Desi"+this.designation);
		
	}
	
	
	
}
