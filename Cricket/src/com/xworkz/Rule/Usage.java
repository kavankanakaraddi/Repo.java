package com.xworkz.Rule;

public class Usage implements CricketRule {
	public int noOfPlayers() {
		System.out.println("11 Players Should be there");
		return 11;
	}

	@Override
	public int noOfOvers() {
		int Overs=20;
		if (Overs == 50) {
			System.out.println("One Day Match");
		} else if (Overs == 20) {
			System.out.println("T-20 Match");
		}
		else if (Overs == 80){
			System.out.println("Test Match");
		}
		return 0 ;
	}

}
