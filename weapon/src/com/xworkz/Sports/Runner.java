package com.xworkz.Sports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList<>();
		collection.add(1);
		collection.add(12);
		collection.add(123);
		collection.add(1234);
		collection.add(12345);
		collection.add(123456);
		collection.add(1234567);
		collection.add(12345678);
		collection.add(123456789);
		collection.add(1234567890);
		System.out.println("collection integernumbers are : " + collection);
		int size=collection.size();
		System.out.println("size is : "+size);
		
		System.out.println("=======================================>>>>>>>>>>");

		Collection<Double> ref1=new ArrayList<>();
		ref1.add(35.0);
		ref1.add(45.0);
		ref1.add(55.0);
		ref1.add(65.0);
		ref1.add(75.0);
		ref1.add(85.0);
		ref1.add(95.0);
		ref1.add(90.00);
		ref1.add(40.0);
		ref1.add(80.0);
		System.out.println("collection double percenatage's are:"+ref1);
		
		int size2=ref1.size();
		System.out.println("size is:"+size2);
		System.out.println("=======================================>>>>>>>>>>");

		Collection<Float> ref2=new LinkedList<>();
		ref2.add(8.0f);
		ref2.add(6.0f);
		ref2.add(9.0f);
		ref2.add(7.75f);
		ref2.add(9.0f);
		ref2.add(8.5f);
		ref2.add(9.1f);
		ref2.add(6.5f);
		ref2.add(6.5f);
		ref2.add(6.80f);
		ref2.add(8.85f);
		System.out.println("collection float Grades are:"+ref2);
		
		int size3=ref2.size();
		System.out.println("size is:"+size3);
		System.out.println("=======================================>>>>>>>>>>");

		Collection<Boolean> ref3=new ArrayList<>();
		ref3.add(false);
		ref3.add(false);
		ref3.add(false);
		ref3.add(false);
		ref3.add(true);
		ref3.add(false);
		ref3.add(true);
		ref3.add(true);
		ref3.add(true);
		ref3.add(false);
		ref3.add(false);
		System.out.println("collection booleanDiploma based:"+ref3);
		
		int size4=ref3.size();
		System.out.println("size is:"+size4);
		System.out.println("=======================================>>>>>>>>>>");

		Collection<Character> ref4=new ArrayList<>();
		ref4.add('K');
		ref4.add('A');
		ref4.add('V');
		ref4.add('A');
		ref4.add('N');
		ref4.add('K');
		ref4.add('A');
		ref4.add('V');
		ref4.add('A');
		ref4.add('N');
		System.out.println("collection FirstCharacter are:"+ref4);
		System.out.println("=======================================>>>>>>>>>>");

		int size5=ref4.size();
		System.out.println("size is:"+size5);
		
		Collection<Byte> ref5=new LinkedList<>();
		ref5.add((byte) 100);
		ref5.add((byte) 110);
		ref5.add((byte) 55);
		ref5.add((byte) 88);
		ref5.add((byte) 75);
		ref5.add((byte) 99);
		ref5.add((byte) 71);
		ref5.add((byte) 66);
		ref5.add((byte) 78);
		ref5.add((byte) 66);
		System.out.println("collection bytemarks are:"+ref5);
		
		int size6=ref5.size();
		System.out.println("size is:"+size6);
		System.out.println("=======================================>>>>>>>>>>");
		
		Collection<Short> ref6=new LinkedList<>();
		ref6.add((short) 4);
		ref6.add((short) 2);
		ref6.add((short) 1);
		ref6.add((short) 3);
		ref6.add((short) 2);
		ref6.add((short) 4);
		ref6.add((short) 3);
		ref6.add((short) 5);
		ref6.add((short) 6);
		ref6.add((short) 2);
		System.out.println("collection shortbacklogs are:"+ref6);
		
		int size7=ref6.size();
		System.out.println("size is:"+size7);
		System.out.println("=======================================>>>>>>>>>>");
		

		Collection<Long> ref7=new LinkedList<>();
		ref7.add((long) 22);
		ref7.add((long) 21);
		ref7.add((long) 25);
		ref7.add((long) 24);
		ref7.add((long) 25);
		ref7.add((long) 28);
		ref7.add((long) 24);
		ref7.add((long) 24);
		ref7.add((long) 26);
		ref7.add((long) 23);
		System.out.println("collection long ages are:"+ref6);
		
		int size8=ref7.size();
		System.out.println("size is:"+size8);
		System.out.println("=======================================>>>>>>>>>>");
		
		
		
		
		

		
	}
}
