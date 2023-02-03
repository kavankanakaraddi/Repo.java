package com.xworkz.boot.chaining;

public class Gym1 {
	public String name;
	public String locatedIn;
	public float opensAt;
	public boolean good;
	public double fees;

	public Gym1() {
		System.out.println("No arg constructor");
	}

	public Gym1(String name) {
		this.name = name;
		System.out.println(" arg name constructor");
	}

	public Gym1(String name, String locatedIn) {
		this(name);
		this.locatedIn = locatedIn;
		System.out.println("Name and locatedin arg constructor");
	}

	public Gym1(String name, String locatedIn, float opensAt) {
		this(name, locatedIn);
		this.opensAt = opensAt;
		System.out.println("Name,opensAt, locatedin arg constructor");
	}

	public Gym1(String name, String locatedIn, float opensAt, boolean good) {
		this(name, locatedIn, opensAt);
		this.good = good;
		System.out.println("Name,opensAt,good, locatedin arg constructor");
	}

	public Gym1(String name, String locatedIn, float opensAt, boolean good, double fees) {
		this(name, locatedIn, opensAt, good);
		this.fees = fees;
		System.out.println("Name,opensAt,good,fees, locatedin arg constructor");
	}

	public void show() {
		System.out.println("Name :" + this.name);
		System.out.println("OpenAt :" + this.opensAt);
		System.out.println("Good :" + this.good);
		System.out.println("Fees :" + this.fees);
		System.out.println("LocatedIn :" + this.locatedIn);

	}
}
