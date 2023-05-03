package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@Component
@ToString
public class Sanketh {
	

	@Value("Panhalkar")
	private String surName;
	@Value("7019629428")
	private long phoneNo;
	@Value("1999")
	private int YOB;
	@Value("5.70d")
	private double height;
	@Value("70.0d")
	private double weight;
	@Value("red")
	private String color;
	@Value("rabakhavi")
	private String nativee;
	@Value("2022")
	private int yearOfPassing;
	@Value("Konnur English medium School")
	private String school;
	@Value("KLE Polytechnic")
	private String college;
	@Value("Goodu PG")
	private String currentStayAt;
	




}
