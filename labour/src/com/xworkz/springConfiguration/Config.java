package com.xworkz.springConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")

public class Config {
	
	@Bean
	public String myName(){
		System.out.println("register in names");
		return "Kavan";
	}

	@Bean
	public String roomName() {
		System.out.println("running roomName method....");
		return "shri-Nilaya";
	}
	@Bean
	public String location() {
		System.out.println("running location method....");
		return "RajajiNagara";
	}
	@Bean
	public String street() {
		System.out.println("running street method....");
		return "RajakumarRoad";
	}
	@Bean
	public String area() {
		System.out.println("running area method....");
		return "GayatriNagar";
	}
	@Bean
	public String nearBy() {
		System.out.println("running nearBy method....");
		return "BusStop";
	}
	@Bean
	public String boy() {
		System.out.println("running boy method....");
		return "Annesh";
	}
	@Bean
	public String girl() {
		System.out.println("running girl method....");
		return "Shubhangi";
	}
	@Bean
	public String school() {
		System.out.println("running school method....");
		return "RoyalPalace";
	}
	@Bean
	public String college() {
		System.out.println("running college method....");
		return "MaheshPUCollege";
	}
	@Bean
	public String Degree() {
		System.out.println("running Degree method....");
		return "BGMIT";
	}
	@Bean
	public String surName() {
		System.out.println("running surName method....");
		return "Kanakaraddi";
	}
	@Bean
	public String nativee() {
		System.out.println("running nativee method....");
		return "Mudhol";
	}
	@Bean
	public String currentPlace() {
		System.out.println("running currentPlace method....");
		return "Bengaluru";
	}
	@Bean
	public String district() {
		System.out.println("running district method....");
		return "Bagalkot";
	}


	

}


