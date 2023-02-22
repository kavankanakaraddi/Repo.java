package com.xowrkz.objects.things;

public class Fish {
	private String breed;
	private String origin;
	private int quantity;
	private double price;
	private boolean taste;
	
	public Fish () {
		System.out.println("No Arg Constr in Fish");
	}

	public Fish(String breed, String origin, int quantity, double price, boolean taste) {
		this.breed = breed;
		this.origin = origin;
		this.quantity = quantity;
		this.price = price;
		this.taste = taste;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Fish" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Fish) {
				System.out.println("obj is Fish");
				Fish casted = (Fish) obj;
				Fish left = this;
				Fish right = casted;
				if (left.breed.equals(right.breed) && left.quantity == right.quantity && left.taste == right.taste && left.price == right.price && (left.origin.equals(right.origin))) {
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
		return "[Breed : " + this.breed + "][ origin : " + this.origin + "][ Price : " + this.price+"]  [ Taste is Good  :"+this.taste+"] [ Quantity is : "+this.quantity+"]";
	}
	

}
