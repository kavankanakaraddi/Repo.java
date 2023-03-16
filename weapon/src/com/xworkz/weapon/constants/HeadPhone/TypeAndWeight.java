package com.xworkz.weapon.constants.HeadPhone;

public enum TypeAndWeight {
	PODS(50),WIRED(150),WIRELESS(100);
	
	private final int weight;
	
	private TypeAndWeight(int weight) {
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}

}
