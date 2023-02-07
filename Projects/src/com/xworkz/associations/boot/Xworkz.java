package com.xworkz.associations.boot;

public class Xworkz {

	public String founder;
	public int noOfTrainee;
	public boolean prictices;
	public HumanResource hr=new HumanResource() ;
	
	
	public void init(String founder,int noOfTrainee, boolean prictices) {
		
		this.founder=founder;
		this.noOfTrainee=noOfTrainee;
		this.prictices=prictices;
	}
	
	public void display() {
		System.out.println("The Founder of the Xworkz is :: "+founder);
		System.out.println("The no Of Trainee in  Xworkz are:: "+founder);
		System.out.println("The Practices in  Xworkz are Good :: "+founder);
		
		System.out.println("*****************");

		this.hr.display();
	}
	
	
	
	
	
}
