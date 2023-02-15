package com.xworkz.inheritance.monday;

public class Camera extends Device{
	public Camera () {
		System.out.println("No Args Constr");
	}
	public Camera (String brand) {
		System.out.println("String constr in Camera");
	}
	public void capture () {
		System.out.println("Running capture in Camera");
	}

}
