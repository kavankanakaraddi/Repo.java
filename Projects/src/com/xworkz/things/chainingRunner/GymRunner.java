package com.xworkz.things.chainingRunner;

import com.xworkz.boot.chaining.Gym;

public class GymRunner {

	public static void main(String[] args) {
		Gym gym = new Gym(20, "BBMP Gym", 'B');
		gym.showDetails();
	}

}