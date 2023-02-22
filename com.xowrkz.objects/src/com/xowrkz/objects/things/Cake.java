package com.xowrkz.objects.things;

public class Cake {
	private String flavour;
	private double weight;
	private String shape;
	private int price;
	
	public Cake () {
		System.out.println("No Arg Constr in Cake");
	}

	public Cake(String flavour, double weight, String shape, int price) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Cake" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Cake) {
				System.out.println("obj is Cake");
				Cake casted = (Cake) obj;
				Cake left = this;
				Cake right = casted;
				if (left.flavour.equals(right.flavour) && left.price == right.price && left.shape.equals(shape) && left.weight == right.weight) {
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
		return "[Flavour : " + this.flavour + "][ Shape : " + this.shape + "][ Weight : " + this.weight+"] [Price : "+this.price+"]";
	}
	

}
