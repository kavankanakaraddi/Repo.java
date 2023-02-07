package com.xworkz.associations.boot;

public class Sun {
	public boolean naturalResources;
	public double sunset;
	
	public Sun(boolean naturalResources,double sunset) {
		this.naturalResources=naturalResources;
		this.sunset=sunset;
	}
	public void display() {
		System.out.println("Sunrise is Natural Resources   ::"+this.naturalResources);
		System.out.println("The Sun set at ::"+this.sunset);
		}
	
	
}
