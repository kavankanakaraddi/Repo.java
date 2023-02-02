package com.xworkz.things;
import com.xworkz.boot.Burger;
public class BurgerRunner {

	public static void main(String[] args) {
		Burger burger = new Burger ("Bigger", 5, 2.5d, 'B', 11000,true); 
	
		burger.display();
	}
}
