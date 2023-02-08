package com.xworkz.setter.boot;

public class IsroRunner {
	public static void main(String[] args) {

		Isro isro = new Isro();
		isro.display();
		String[] loacations= {"BENGALURU","MYSORE" };
		isro.setloacations(loacations);
		
		int[] numbers= {23,45};
		isro.setsatelliteNos(numbers);
		isro.display();
	}

}
