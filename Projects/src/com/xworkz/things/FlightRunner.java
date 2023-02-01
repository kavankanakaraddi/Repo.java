package com.xworkz.things;
import com.xworkz.boot.Flight;
public class FlightRunner {

	public static void main(String[] args) {
	
		
	
	Flight flight=new Flight ();
	flight.display();
	
	flight.name="Air India";
	flight.cost=250;
	flight.capacity=150;
	flight.flightNumber=0202;
	flight.location="Bangalore";
	flight.SeatsFilled=125;
	
	flight.display();
	
	
	}

}
