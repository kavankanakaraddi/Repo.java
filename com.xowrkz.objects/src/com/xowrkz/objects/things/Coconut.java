package com.xowrkz.objects.things;

public class Coconut {
	private String Origin;
	private int price;
	private boolean good;
	private double quantity;

	public Coconut() {
		System.out.println("No Args Constructor in Coconut");
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return 9845;
	}
	@Override
	public String toString() {
		return "Orgin of Coconut:: "+this.Origin+"  Price is :: "+this.price+"  Taste is good ::"+this.good+"  Quantity is ::"+this.quantity;
	}

}
