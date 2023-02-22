package com.xowrkz.objects.things;

public class Chiefminister {
	private String cmOf;
	private String name;
	private int age;
	private int noOfTimesElected;
	private int security;
	private String car;
	private int nooofCars;
	private int cases;
	private String degree;
	private String nativePlace;
	private boolean workDone;
	private int supportInAssembly;
	
	public Chiefminister () {
		System.out.println("No Arg Constr in Chiefminister ");
	}

	public Chiefminister(String cmOf, String name, int age, int noOfTimesElected, int security, String car,
			int nooofCars, int cases, String degree, String nativePlace, boolean workDone, int supportInAssembly) {
		this.cmOf = cmOf;
		this.name = name;
		this.age = age;
		this.noOfTimesElected = noOfTimesElected;
		this.security = security;
		this.car = car;
		this.nooofCars = nooofCars;
		this.cases = cases;
		this.degree = degree;
		this.nativePlace = nativePlace;
		this.workDone = workDone;
		this.supportInAssembly = supportInAssembly;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Chiefminister" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Chiefminister) {
				System.out.println("obj is Chiefminister");
				Chiefminister casted = (Chiefminister) obj;
				Chiefminister left = this;
				Chiefminister right = casted;
				if (left.name.equals(right.name)&& (left.cmOf.equals(right.cmOf)&& (left.degree.equals(right.degree) && left.car == right.car && left.cases == right.cases && left.noOfTimesElected == right.noOfTimesElected && (left.nativePlace.equals(right.nativePlace)&& (left.workDone==(right.workDone)&&(left.supportInAssembly==(right.supportInAssembly) && (left.security==(right.security)) && (left.nooofCars==(right.nooofCars)))))))) {
					System.out.println("Left is Equal to Right ");
				} else {
					System.out.println("Left is Not Equal to Right ");
				}

			} else {
				System.out.println("Object is not Fish");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return true;
	}
	@Override
	public String toString() {
		return "[Name : " + this.name + "][ CM of : " + this.cmOf + "][ Degree : " + this.degree+"]  [ Workdone :"+this.workDone+"] [ Native place : "+this.nativePlace+"] [ Car : "+this.car+"] [ No Of cars : "+this.nooofCars+"] [ No of Cases  "+this.cases+"] [ Security :"+this.security+"] [ Age  : "+this.age+" ]";
	}
	
	
	
	

}
