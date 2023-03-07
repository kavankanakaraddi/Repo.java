package com.xworkz.rule.implimentor;

import com.xworkz.rule.interfaceclass.railwayStation;

public class Staff implements railwayStation {

	@Override
	public String name() {
		System.out.println("RailwayStation Name::");
		return "YSNPR";
	}

	@Override
	public int kmFromBusStop() {
		System.out.println("kmFromBusStop::");
		return 5;
	}

	@Override
	public String trainName() {
		System.out.println("trainName::");
		return "HariPriya";
	}

	@Override
	public float timings() {
		System.out.println("timings::");
		return 7;
	}

	@Override
	public boolean maintainTime() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String location() {
		// TODO Auto-generated method stub
		return "RRNagar";
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode in Staff....");
		return 452;
	}

	@Override
	public String toString() {
		System.out.println("toString method in Staff...");
		return " 2526255";
	}

}