package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Kavan {
	
	@Value("Patil")
	private String surName;
	@Value("7676784502")
	private long phoneNo;
	@Value("1996")
	private int YOB;
	@Value("5.6")
	private double height;
	@Value("65.5")
	private double weight;
	@Value("white")
	private String color;
	@Value("Bengaluru")
	private String nativee;
	@Value("2020")
	private int yearOfPassing;
	@Value("Government School")
	private String school;
	@Value("Government college")
	private String college;
	@Value("Room")
	private String currentStayAt;

	public String dataOfStudents() {
		System.out.println("Running in Students Data");
		return "X-Workz";
	}

	@Override
	public String toString() {
		return "Kavan [surName=" + surName + ", phoneNo=" + phoneNo + ", YOB=" + YOB + ", height=" + height
				+ ", weight=" + weight + ", color=" + color + ", nativee=" + nativee + ", yearOfPassing="
				+ yearOfPassing + ", school=" + school + ", college=" + college + ", currentStayAt=" + currentStayAt
				+ "]";
	}
	

}
