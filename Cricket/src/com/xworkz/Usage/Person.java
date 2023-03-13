package com.xworkz.Usage;

import com.xworkz.Delivery.Delivery;

public class Person {

	private Delivery delivery;

	public Person(Delivery delivery) {
		System.out.println("Constructor ");
		this.delivery = delivery;
	}
	public void display() {
		double charges=this.delivery.charges();
		double timeTaken=this.delivery.timeTaken();
		String agentName=this.delivery.agentName(2);
		if (charges<60) {
			System.out.println("Charges are ok"+charges);
		}
		if (charges>60) {
			System.out.println("charges are Expenssive"+charges);
		}
		if (timeTaken<=15) {
			System.out.println("On Time Delivery"+timeTaken);
		}
		if (timeTaken>15) {
			System.out.println("Delayed Delivery"+timeTaken);
		}
		System.out.println(agentName);
		}
	

}