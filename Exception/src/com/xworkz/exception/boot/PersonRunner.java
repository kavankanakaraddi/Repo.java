package com.xworkz.exception.boot;

import com.xworkz.exception.things.Doctor;
import com.xworkz.exception.things.Engineer;

public class PersonRunner {

	public static void main(String[] args) {
		Engineer engineer = new Engineer(7676,"Sparsh",16,"Sparsh@gmail.com");
		System.out.println(engineer);
		System.out.println(engineer.hashCode());
		
		System.out.println("******************************************");
		
		Engineer engineer2 = new Engineer(7777,"Sparshaa",21,"Sparshaa@gmail.com");
		System.out.println(engineer2);
		System.out.println(engineer2.hashCode());
		
		boolean equal = engineer.equals(engineer2);
		System.out.println(equal);
		
		System.out.println("******************************************");


		Engineer engineer3 = new Engineer(5555,"prashant",17,"Prashanth@gmail.com");
		System.out.println(engineer3);
		System.out.println(engineer3.hashCode());
		
		boolean equal1 = engineer2.equals(engineer3);
		System.out.println(equal1);

		System.out.println("===============================================");
		
		Doctor doctor = new Doctor();
		System.out.println(doctor);
		System.out.println(doctor.hashCode());
		
		System.out.println("//////////////////////////////////////////////");

		Doctor doctor2 = new Doctor("Appollo",5555,"Raju","MBBS");
		System.out.println(doctor2);
		System.out.println(doctor2.hashCode());
		
		boolean song = doctor.equals(doctor2);
		System.out.println(song);

		System.out.println("******************************************");

		Doctor doctor3 = new Doctor(4455,"Arjun",44,"12457@gmail.com","MBBs");
		System.out.println(doctor3);
		System.out.println(doctor3.hashCode());
		
		boolean song1 = doctor.equals(doctor3);
		System.out.println(song1);

		


	}

}
