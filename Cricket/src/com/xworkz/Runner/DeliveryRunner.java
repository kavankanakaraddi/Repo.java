package com.xworkz.Runner;

import com.xworkz.Delivery.Delivery;
import com.xworkz.Usage.Person;
import com.xworkz.impl.Dunzo;
import com.xworkz.impl.Rapido;

public class DeliveryRunner {

	public static void main(String[] args) {
		Delivery delivery=new Dunzo();
		
		Person person=new Person(delivery);
		person.display();
		
		Delivery delivery1 = new Rapido();
		Person person2=new Person(delivery1);
		person2.display();
		
	}
}
