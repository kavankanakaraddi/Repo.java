package com.xworkz.setter.boot;

public class Degree {

	public String name;
	public int duration;
	public boolean parsuing;
	public double percentage;
	public String branch;
	
	public void setname(String name) {
		this.name=name;
	}
	public void setduration(int duration) {
		this.duration=duration;
	}
	public void setparsuing( boolean parsuing) {
		this.parsuing=parsuing;
	}
	public void setpercentage(double percentage) {
		this.percentage=percentage;
	}
	public void setbranch (String branch) {
		this.branch=branch;
	}
	public void show() {
		System.out.println("The Degree completed:"+this.name);
		System.out.println("The duration is :"+this.duration);
		System.out.println("The Degree Parsuing"+this.parsuing);
		System.out.println("% in Degree == "+this.percentage);
		System.out.println("Branch is :"+this.branch);
	}
	
	
}
