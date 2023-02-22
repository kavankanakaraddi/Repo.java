package com.xowrkz.objects.things;

public class Alcohol {
	private String brand ;
	private int price;
	private String type;
	private double percentage;
	
	public Alcohol() {
		System.out.println("No Args Constr in Alcohol");
	}

	public Alcohol(String brand, int price, String type, double percentage) {
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.percentage = percentage;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Alcohol" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Alcohol) {
				System.out.println("obj is Alcohol");
				Alcohol casted = (Alcohol) obj;
				Alcohol left = this;
				Alcohol right = casted;
				if (left.brand.equals(right.brand) && left.percentage == right.percentage && left.price == right.price &&( left.type.equals(right.type ))) {
					System.out.println("Left is Equal to Right ");
				} else {
					System.out.println("Left is Not Equal to Right ");
				}

			} else {
				System.out.println("Object is not Alcohol");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return true;
	}
	@Override
	public String toString() {
		return "[Brand : " + this.brand + "][ Percentage  : " + this.percentage + "][ Price : " + this.price+"]  [ Type :"+this.type+"]";
	}
	

}
