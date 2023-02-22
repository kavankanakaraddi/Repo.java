package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Policestation;

public class PoliceststaionRunner {

	public static void main(String[] args) {
		Policestation policestation = new Policestation ("CPI Office","RRNagara","Crime",120,80,40,550,"Annesh","Bengaluru","Karnataka");
		System.out.println(policestation.toString());
		
		System.out.println(policestation.equals(policestation));
		
		Policestation policestation2 = new Policestation ("CPI Office","KRPuram","Crime",120,80,40,550,"Annesh","Bengaluru","Karnataka");
		System.out.println(policestation2.toString());
		
		System.out.println(policestation.equals(policestation2));
	}

}
