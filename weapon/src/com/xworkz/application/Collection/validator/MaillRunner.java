package com.xworkz.application.Collection.validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MaillRunner {

	public static void main(String[] args) {
		
		Collection<String> mail = new ArrayList<>();
		mail.add("Kavank@gmail.com");
		mail.add("Annesh@gmail.com");
		mail.add("Priyanka@gmail.com");
		mail.add("sanketh@gmail.com");
		mail.add("pradeep@gmsil.com");
		
		//Collection<String> yahoo = new ArrayList<>();

		mail.add("Kavank@yahoo.com");
		mail.add("Annesh@yahoo.com");
		mail.add("Priyanka@yahoo.com");
		mail.add("sanketh@yahoo.com");
		mail.add("pradeep@yahoo.com");
		
		
		//Collection<String> out = new ArrayList<>();

		mail.add("bengaluru@outlook.com");
		mail.add("Navarang@outlook.com");
		mail.add("Mudhol@outlook.com");
		mail.add("Bagalkot@outlook.com");
		mail.add("Cooorg@outlook.com");
		mail.add("Sakleshpura@outlook.com");
		mail.add("Murdeshwar@outlook.com");
		mail.add("Mysore@outlook.com");
		
		//Collection<String> work = new ArrayList<>();

		
		mail.add("Akshata.xworkz@gmail.com");
		mail.add("Vinoda.xworkz@gmail.com");
		mail.add("om.xworkz@gmail.com");
		mail.add("suhas.xworkz@gmail.com");
		mail.add("akshara.xworkz@gmail.com");
		mail.add("kirthana.xworkz@gmail.com");
		mail.add("suchitra.xworkz@gmail.com");
		mail.add("kiran.xworkz@gmail.com");
		mail.add("ramesh.xworkz@gmail.com");
		mail.add("rinku.xworkz@gmail.com");
		mail.add("shri.xworkz@gmail.com");
		
		mail.stream().map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(e->System.err.println(e));

		
		
		

		
	}

}
