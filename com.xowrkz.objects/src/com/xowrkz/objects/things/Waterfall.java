package com.xowrkz.objects.things;

public class Waterfall {
	private String name;
	private double height;
	private String location;
	
	public Waterfall () {
		System.out.println("No Arg Constr in Waterfall");
	}

	public Waterfall(String name, double height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Waterfall" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Waterfall) {
				System.out.println("obj is Waterfall");
				Waterfall casted = (Waterfall) obj;
				Waterfall left = this;
				Waterfall right = casted;
				if (left.name.equals(right.name) && left.height == right.height && (left.location.equals(right.location))) {
					System.out.println("Left is Equal to Right ");
				} else {
					System.out.println("Left is Not Equal to Right ");
				}

			} else {
				System.out.println("Object is not Cake");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return true;
	}
	@Override
	public String toString() {
		return "[Name : " + this.name + "][ Height  : " + this.height + "][ Location : " + this.location+"]";
	}
	

}
