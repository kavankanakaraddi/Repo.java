package com.xworkz.associations.boot;

public class Wallet {

	public String brand;
	public int cards;
	public Cash cash;

	public void init(Cash cash) {
		this.cash = cash;
	}

	public Wallet(String brand, int cards) {

		this.brand = brand;
		this.cards = cards;
	}

	public void display() {
		System.out.println("The wallet Brand is ::" + this.brand);
		System.out.println("The no of  cards in Wallet are ::" + this.cards);
		if ( cash != null ) {
			this.cash.display();
		} else {
			System.err.println("cash is not pointed to any address");
		}
	}
 
}
