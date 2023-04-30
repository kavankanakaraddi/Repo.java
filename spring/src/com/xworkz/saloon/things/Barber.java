package com.xworkz.saloon.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Barber {

	private String name;
	private double experience;
	private double salary;
	private int age;
	private long contactNo;
	private String gender;

	public Barber(@Value("Annesh")  String name,@Value("2.5")  double experience, @Value("25.250") double salary,@Value("30")  int age,@Value("7676784502")  long contactNo,@Value("Female")  String gender) {
		super();
		this.name = name;
		this.experience = experience;
		this.salary = salary;
		this.age = age;
		this.contactNo = contactNo;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Barber [name=" + name + ", experience=" + experience + ", salary=" + salary + ", age=" + age
				+ ", contactNo=" + contactNo + ", gender=" + gender + "]";
	}
	

}
