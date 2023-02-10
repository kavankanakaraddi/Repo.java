package com.xworkz.tasks.boot;

public class Mall {
	public String name;
	public boolean ambience;
	public int totalFloors;
	public Security security;
	
	public  void setMall(String name, boolean ambience,int totalFloors) {
		this.ambience=ambience;
		this.name=name;
		this.totalFloors=totalFloors;
	}
	public void setSecurity (Security security) {
		this.security=security;
	}
	public void display() {
		System.out.println("Details of Security");
		System.out.println("name::"+this.name);
		System.out.println("ambience:: "+this.ambience);
		System.out.println("totalFloors::"+this.totalFloors);
		if (this.security!=null) {
			this.security.display();
		}else {
			System.err.println("this.Security is null ......");
		}

	}
		
}
