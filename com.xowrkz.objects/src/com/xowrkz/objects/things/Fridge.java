package com.xowrkz.objects.things;

public class Fridge {
	private String brand;
	private int doors;
	private double liters;
	private boolean good;
	private int sections;
	private int wattInTake;
	
	public Fridge () {
		System.out.println("No Arg Constr in Fridge");
	}

	public Fridge(String brand, int doors, double liters, boolean good, int sections, int wattInTake) {
		this.brand = brand;
		this.doors = doors;
		this.liters = liters;
		this.good = good;
		this.sections = sections;
		this.wattInTake = wattInTake;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Fridge" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Fridge) {
				System.out.println("obj is Fridge");
				Fridge casted = (Fridge) obj;
				Fridge left = this;
				Fridge right = casted;
				if (left.brand.equals(right.brand) && left.doors == right.doors && left.good == right.good && left.liters == right.liters &&( left.sections == right.sections ) &&( left.wattInTake==right.wattInTake )) {
					System.out.println("Left is Equal to Right ");
				} else {
					System.out.println("Left is Not Equal to Right ");
				}

			} else {
				System.out.println("Object is not Fridge");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return true;
	}
	@Override
	public String toString() {
		return "[Brand : " + this.brand + "][ Watt In take  : " + this.wattInTake + "][ Sectionst : " + this.sections+"]  [ Capacity in ltrs  :"+this.liters+"] [ Quality is Good : "+this.good +"]";
	}
	
	

}
