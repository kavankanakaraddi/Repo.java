package com.xworkz.boot.chaining;

public class Gym {

	public String name;
	public double timings;
	public int members;
	public char grade;
	public float noOfEquipments;
	public String locatedIn;

	public Gym(String name, double timings) {
		this.name = name;
		this.timings = timings;
	}

	public Gym(int members, char grade, String name, double timings) {
		this(name, timings);
		this.members = members;
		this.grade = grade;
	}

	public Gym(double timings, float noOfEquipments, String name) {
		this(name, timings);

		this.noOfEquipments = noOfEquipments;
	}

	public Gym(float noOfEquipments, String name, char grade) {
		this(grade, noOfEquipments, name);

	}

	public Gym(String locatedIn, String name, double timings) {
		this(name, timings);
		this.locatedIn = locatedIn;
	}

	public Gym(String locatedIn, float noOfEquipments, String name) {
		this(name, locatedIn, noOfEquipments);
	}

	public Gym(String name, String locatedIn, float noOfEquipments) {
		System.out.println("arg constr");
	}

	public void showDetails() {
		System.out.println("The Gym Timings is ::" + timings);
		System.out.println("The Gym Members are  ::" + members);
		System.out.println("The Gym Name is   ::" + name);
		System.out.println("The Gym Grade is   ::" + grade);
		System.out.println("The Gym  having noOfEquipments are  ::" + noOfEquipments);
		System.out.println("The Gym locatedIn   ::" + locatedIn);
	}

}
