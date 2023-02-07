package com.xworkz.associations.boot;

public class Cash {
	public double amount;
	public String  cards;
	
	



	public Cash(double amount,  String  cards) {
		
		this.amount = amount;
		this.cards = cards;
	}

	public void display() {
		System.out.println("The wallet having cash of  ::"+this.amount);
		System.out.println("The name of cards in Wallet is::"+this.cards);
		}


}
