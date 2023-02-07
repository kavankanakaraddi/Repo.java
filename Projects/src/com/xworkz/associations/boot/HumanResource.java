package com.xworkz.associations.boot;

public class HumanResource {

	public String name;
	public int present;
	public boolean punctual;
	
	
	
public  void hr (String name,int present, boolean punctual) {
		
		this.name=name;
		this.present=present;
		this.punctual=punctual;
	}
	
	public void display() {
		System.out.println("The name of the HumanResource is :: "+name);
		System.out.println("The prsent dys :: "+present);
		System.out.println("The Hr is Pumctual :: "+punctual);
		
	}
	
	
}
