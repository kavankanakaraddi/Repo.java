package com.xworkz.exception.things;

public final class Final {

	private String name;
	private int homeNumber;
	private final String PAN = "DDDDD025861H";

	public Final(String name, int homeNumber) {
		super();
		this.name = name;
		this.homeNumber = homeNumber;
	}

	@Override
	public String toString() {
		return "Final [name=" + name + ", homeNumber=" + homeNumber + ", PAN=" + PAN + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getPAN() {
		return PAN;
	}

}
