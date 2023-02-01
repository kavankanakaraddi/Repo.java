package com.xworkz.boot;

public class Flight {
public String name;
public double cost;
public int  capacity;
public String location;
public int flightNumber;
public String startsFrom;
public int SeatsFilled;



public void display() {
System.out.println(name);
System.out.println(cost);
System.out.println(flightNumber);
System.out.println(startsFrom);
System.out.println(SeatsFilled);
System.out.println(capacity);
	}
}