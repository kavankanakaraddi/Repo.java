package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Park;

public class ParkRunner {

	public static void main(String[] args) {
		Park park = new Park ("Navarang Park","BNGLR",5,9,10,true);
		System.out.println(park.toString());
		
		System.out.println(park.equals(park));
		
		Park Park2 = new Park ("RajajiNagar Park","BNGLR",5,9,10,true);
		System.out.println(Park2.toString());
		
		System.out.println(park.equals(Park2));
	}

}
