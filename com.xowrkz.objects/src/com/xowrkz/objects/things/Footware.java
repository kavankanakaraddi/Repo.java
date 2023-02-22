package com.xowrkz.objects.things;

public class Footware {
	private String brand;
	private int size;
	private String type;
	
	public Footware () {
		System.out.println("No Args Constructor in Footware ");
	}

	public Footware(String brand, int size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Footware" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Footware) {
				System.out.println("obj is Footware");
				Footware casted = (Footware) obj;
				Footware left = this;
				Footware right = casted;
				if (left.brand.equals(right.brand) && left.size == right.size && left.type == right.type) {
					System.out.println("Left is Equal to Right ");
				} else {
					System.out.println("Left is Not Equal to Right ");
				}

			} else {
				System.out.println("Object is not TV");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return true;
	}
	@Override
	public String toString() {
		return "[Brand : " + this.brand + "][ Size : " + this.size + "][ Type : " + this.type+"]";
	}


	

}
