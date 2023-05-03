package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rikesh {

	@Value("Patil")
	private String surName;
	@Value("9945253779")
	private long phoneNo;
	@Value("1998")
	private int YOB;
	@Value("5.5")
	private double height;
	@Value("58.7")
	private double weight;
	@Value("red")
	private String color;
	@Value("Ilakal")
	private String nativee;
	@Value("2020")
	private int yearOfPassing;
	@Value("Government School")
	private String school;
	@Value("Government college")
	private String college;
	@Value(" Sai PG")
	private String currentStayAt;

	@Override
	public String toString() {
		return "Rikesh [surName=" + surName + ", phoneNo=" + phoneNo + ", YOB=" + YOB + ", height=" + height
				+ ", weight=" + weight + ", color=" + color + ", nativee=" + nativee + ", yearOfPassing="
				+ yearOfPassing + ", school=" + school + ", college=" + college + ", currentStayAt=" + currentStayAt
				+ "]";
	}

}
