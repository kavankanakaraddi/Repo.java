package com.xworkz.associations.things;

import com.xworkz.associations.boot.Fridge;
import com.xworkz.associations.boot.Cooldrink;

public class CooldrinkRunner {

	public static void main(String[] args) {
		
		Fridge fridge = new Fridge("WhirlPool",2);
		fridge.display();
		Cooldrink cooldrink = new Cooldrink (false,250.05);
		cooldrink.display();
	
		

	}
}
