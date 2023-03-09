package com.xworkz.exception.boot;

public class Even {

	public static  void Eve() {
		int numb = 9;
		int num =0;
		if (numb % 2 == 0) {
			System.out.println("Even Numb== " + numb);
		} else {
			System.out.println("Odd numb== " + numb);
		}
	
	}

	public static void main(String[] args) {
		Even.Eve();

	}

}
