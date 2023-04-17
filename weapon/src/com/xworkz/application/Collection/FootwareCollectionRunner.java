package com.xworkz.application.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FootwareCollectionRunner {

	public static void main(String[] args) {

		Collection<Integer> MenSize = new ArrayList<Integer>();
		MenSize.add(5);
		MenSize.add(6);
		MenSize.add(7);
		MenSize.add(8);
		MenSize.add(9);
		MenSize.add(10);
		MenSize.add(11);
		MenSize.add(12);
		MenSize.add(13);
		MenSize.add(14);

		System.out.println("Total Size is : " + MenSize.size());

		Collection<Integer> womenSize = new ArrayList<Integer>();
		womenSize.add(5);
		womenSize.add(6);
		womenSize.add(7);
		womenSize.add(8);
		womenSize.add(8);
		womenSize.add(9);
		womenSize.add(10);
		womenSize.add(11);
		womenSize.add(12);
		womenSize.add(13);
		womenSize.add(14);

		Collection<Integer> kidsShoeSize = new ArrayList<Integer>();
		kidsShoeSize.add(1);
		kidsShoeSize.add(2);
		kidsShoeSize.add(3);
		kidsShoeSize.add(4);
		kidsShoeSize.add(5);

		Collection<Integer> allShoeSize = new ArrayList<Integer>();
		allShoeSize.addAll(womenSize);
		allShoeSize.addAll(kidsShoeSize);
		allShoeSize.addAll(MenSize);

		System.out.println("All Shoes Sizes : " + allShoeSize.size());
		for (int size : allShoeSize) {
			System.out.println("Sizes : " + size);

		}
		boolean containsAll = allShoeSize.containsAll(MenSize);
		System.out.println("Contains All : " + containsAll + "Sizes : " + allShoeSize.size());

		boolean removed = allShoeSize.containsAll(kidsShoeSize);
		System.out.println("Remove All : " + removed + "  : Sizes : " + allShoeSize.size());
		
		boolean retain = allShoeSize.retainAll(kidsShoeSize);
		System.out.println("Retain All : " + retain + "  : Sizes : " + allShoeSize.size());
		
		Object[] array = allShoeSize.toArray();
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		

		// System.out.println("All the contents are Equal :
		// "+womenSize.containsAll(MenSize));
		// System.out.println("Before Remove All Operation : " + womenSize.size() + " :
		// " + womenSize);
		// MenSize.removeAll(womenSize);
		// System.out.println("After Remove all Operation : " + MenSize);

	}

}
