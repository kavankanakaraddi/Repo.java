package com.xowrkz.objects.things;

public class Policestation {
	private String name;
	private String location;
	private String type;
	private int cops;
	private int menCops;
	private int womenCops;
	private double noOfCasesRunning;
	private String psiName;
	private String district;
	private String state;
	
	public Policestation () {
		System.out.println("No Args Constr in Policestation");
	}

	public Policestation(String name, String location, String type, int cops, int menCops, int womenCops,
			double noOfCasesRunning, String psiName, String district, String state) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.cops = cops;
		this.menCops = menCops;
		this.womenCops = womenCops;
		this.noOfCasesRunning = noOfCasesRunning;
		this.psiName = psiName;
		this.district = district;
		this.state = state;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Policestation" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Policestation) {
				System.out.println("obj is Policestation");
				Policestation casted = (Policestation) obj;
				Policestation left = this;
				Policestation right = casted;
				if (left.name.equals(right.name)&& (left.type.equals(right.type) && left.cops == right.cops && left.menCops == right.menCops && left.womenCops == right.womenCops && (left.district.equals(right.district)&& (left.location.equals(right.location)&&(left.noOfCasesRunning==(right.noOfCasesRunning) && (left.psiName.equals(right.psiName)) && (left.state.equals(right.state))))))) {
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
		return "[Name : " + this.name + "][ Location : " + this.location + "][ Type : " + this.type+"]  [ Men Cops  :"+this.menCops+"] [ Women Cops : "+this.womenCops+"] [ District : "+this.district+"] [ State : "+this.state+"] [ No of Cases Running "+this.noOfCasesRunning+"] [ PSI Name"+this.psiName+"] [ Total Cops : "+this.cops+" ]";
	}
	

}
