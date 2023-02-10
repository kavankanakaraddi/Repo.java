package com.xworkz.tasks.boot;

public class Country {
	public String countryName;
	public String president;
	public boolean developed ;
	public State state;
	
	public Country (String countryName, String president,boolean developed) {
		this.countryName=countryName;
		this.developed=developed;
		this.president=president;
	}
	public void  setState(State state) {
		this.state=state;
	}
	public void display() {
		System.out.println("countryName:"+this.countryName);
		System.out.println("president:"+this.president);
		System.out.println("developed:"+this.developed);
		if (this.state!=null) {
			this.state.display();
		}
		else {
			System.out.println("this.State is not pointing to any address");
		}
	}
	
	
	
	
}
