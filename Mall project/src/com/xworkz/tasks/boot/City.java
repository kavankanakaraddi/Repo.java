package com.xworkz.tasks.boot;

public class City {

	public String name;
	public String district;
	public String capital;
	public Area area;

	public void city(String name, String district, String capital) {
		this.name = name;
		this.district = district;
		this.capital = capital;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void display() {
		System.out.println("Name:" + this.name);
		System.out.println("District:" + this.district);
		System.out.println("Capital:" + this.capital);
		if (this.area != null) {
			this.area.display();
		} else {
			System.out.println("this.area is not pointing to any address");
		}
	}

}
