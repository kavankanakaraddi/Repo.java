package com.xworkz.exception.boot;

public class Reverse {

	public static void main(String[] args) {
		String name="ABCD";
		String rev=" ";
		
		int len=name.length();
		int count=0; 
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}
