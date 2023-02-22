package com.xowrkz.objects.things;

public class TV {
	private String brand;
	private int size;
	private double price;

	public TV() {
		System.out.println("No Arg Constructor in TV");
	}

	public TV(String brand, int size, double price) {
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in TV" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof TV) {
				System.out.println("obj is TV");
				TV casted = (TV) obj;
				TV left = this;
				TV right = casted;
				if (left.brand.equals(right.brand) && left.size == right.size && left.price == right.price) {
					System.out.println("Left is Equal to Right ");
				} else {
					System.out.println("Left is N ot Equal to Right ");
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
		return "Brand : " + this.brand + " Size : " + this.size + " Price : " + this.price;
	}

}
