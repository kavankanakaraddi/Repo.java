package com.xworkz.rule.implimentor;

import com.xworkz.rule.interfaceclass.railwayStation;

public class railwayStationRunner {

	public static void main(String[] args) {
	railwayStation station = new Staff();
	String name= station.name();
	System.out.println(name);
	System.out.println(station.kmFromBusStop());
	System.out.println(station.location());
	System.out.println(station.maintainTime());
	System.out.println(station.timings());
	System.out.println(station.equals(name));
	System.out.println(station.hashCode());
	

	}

}
