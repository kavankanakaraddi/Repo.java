package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Savithri {

	@Value("kandgal")
	private String surName;
	@Value("9743735361")
	private long phoneNo;
	@Value("1994")
	private int YOB;
	@Value("4.9")
	private double height;
	@Value("50.0")
	private double weight;
	@Value("white")
	private String color;
	@Value("Bagalkot")
	private String nativee;
	@Value("2015")
	private int yearOfPassing;
	@Value("Govt School")
	private String school;
	@Value("BIT davanagere ")
	private String college;
	@Value("Morning Star PG")
	private String currentStayAt;
}
