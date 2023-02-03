package com.xworkz.things.chainingRunner;

import com.xworkz.boot.chaining.Gym1;

public class Gym1Runner {

	public static void main(String[] args) {
		Gym1 gym = new Gym1();
		gym.show();
		System.out.println("    ");
		Gym1 gym1 = new Gym1("BBMP Gym", "Navarang");
		gym1.show();

	}

}
