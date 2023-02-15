package com.xworkz.inheritance.Tuesday;

import com.xworkz.inheritance.monday.Cricket;
import com.xworkz.inheritance.monday.Sport;

public class SportRunner {

	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		cricket.players();
		cricket.play();
		
		String cricket1= cricket.getType();
		System.out.println(cricket1);
		
		Sport sport = new Cricket ();
		sport.play();
		sport.getType();
		
		Cricket casted = (Cricket)sport;
		casted.players();
	}

}
