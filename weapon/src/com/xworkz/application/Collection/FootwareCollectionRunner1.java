package com.xworkz.application.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class FootwareCollectionRunner1 {

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

		System.out.println("Before Remove All Operation : " + MenSize.size()+" :  "+MenSize);

		Collection<Integer> womenSize = new ArrayList<Integer>();
		womenSize.add(5);
		womenSize.add(6);
		womenSize.add(7);
		womenSize.add(8);
		womenSize.add(9);
		womenSize.add(10);
		womenSize.add(11);
		//womenSize.add(12);
		//womenSize.add(13);
		//womenSize.add(14);
		//womenSize.add(14);

		
		
		System.out.println("Before Remove All Operation : "+womenSize.size()+" : "+womenSize);
		
        MenSize.removeAll(womenSize);
        
        System.out.println("After Remove all Operation : "+MenSize);

		



	}

}
