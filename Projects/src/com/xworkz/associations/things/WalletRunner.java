package com.xworkz.associations.things;

import com.xworkz.associations.boot.Cash;
import com.xworkz.associations.boot.Wallet;

public class WalletRunner {

	public static void main(String[] args) {
		String brand="K";	
		Wallet wallet = new Wallet(brand, 4);
		wallet.display();
		Cash cash = new Cash (20.0,"Debit");
		cash.display();
	
		

	}

}
