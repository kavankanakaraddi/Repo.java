package com.xowrkz.objects.boot;
import com.xowrkz.objects.things.Footware;

public class FootwareRunner {

	public static void main(String[] args) {
		Footware footware = new Footware ("CROCS",11,"CLOGS");
		System.out.println(footware.toString());
		
		System.out.println(footware.equals(footware));
		
		Footware footware2 = new Footware ("VKC",8,"Sandals");
		System.out.println(footware2.toString());
		
		System.out.println(footware.equals(footware2));
		
	

	}

}
