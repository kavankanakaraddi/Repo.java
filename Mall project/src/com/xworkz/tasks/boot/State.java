package com.xworkz.tasks.boot;

public class State {
	public String name;
	public String cmName;
	public String langauge;
	public City city;

	public State(String name, String cmName, String langauge) {
		this.name = name;
		this.cmName = cmName;
		this.langauge = langauge;
	}

	public State(City city) {
		this.city = city;
	}

	public void display() {
		System.out.println("Name:" + this.name);
		System.out.println("cmName:" + this.cmName);
		System.out.println("langauge:" + this.langauge);
		if (this.city != null) {
			this.city.display();
		} else {
			System.out.println("this.city is not pointing to any address");
		}
	}

}
