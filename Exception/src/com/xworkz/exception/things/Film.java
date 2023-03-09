package com.xworkz.exception.things;

public class Film {
	public String name = "KGF";

	public Film() {
		System.out.println("No String Args Constructor In Film");
	}

	public Film(String name) {

		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
