package com.xworkz.tasks.things;

import com.xworkz.tasks.boot.Address;
import com.xworkz.tasks.boot.Area;
import com.xworkz.tasks.boot.City;
import com.xworkz.tasks.boot.Company;
import com.xworkz.tasks.boot.Country;
import com.xworkz.tasks.boot.Mall;
import com.xworkz.tasks.boot.Security;
import com.xworkz.tasks.boot.State;

public class MallRunner {

	public static void main(String[] args) {
		System.out.println("*****************************");
		Area area = new Area("RajajiNagara",580000,"Bashyam Circle");
		area.display();
		System.out.println("*****************************");
		City city = new City();
		city.display();
		System.out.println("******************************");
		State state = new State("Karnataka","Basavaraj Bommai" ,"Kannada");
		state.display();
		System.out.println("******************************");
		Country country = new Country("India","Draupadi Murmu ji",true);
		country.display();
		System.out.println("******************************");
		Address address = new Address ();
		address.setCountry(country);
		System.out.println("******************************");
		Company company = new Company ();
		company.setname("CYBER");
		company.setceoname("Annesh");
		company.setsince(1988);
		company.display();
		System.out.println("******************************");
		Security security = new Security();
		security.setsecurity("SRF", 3500, "Gowda");
		security.display();
		Mall mall = new Mall ();
		mall.setMall("Mantri", false,7);
		mall.display();
	}

}
