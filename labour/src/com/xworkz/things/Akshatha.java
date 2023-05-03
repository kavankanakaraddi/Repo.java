package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Akshatha {
	

	@Value("Kathare")
	private String surName;
	@Value("7204223793")
	private long phoneNo;
	@Value("2001")
	private int YOB;
	@Value("5.0")
	private double height;
	@Value("53.3")
	private double weight;
	@Value("red")
	private String color;
	@Value("Dharawad")
	private String nativee;
	@Value("2022")
	private int yearOfPassing;
	@Value("presentation School")
	private String school;
	@Value("KCD ")
	private String college;
	@Value("Golden PG")
	private String currentStayAt;

	public String dataOfStudents() {
		System.out.println("Running in Students Data");
		return "X-Workz";
	}

}
