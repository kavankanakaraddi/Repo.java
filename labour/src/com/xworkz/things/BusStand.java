package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BusStand {

	@Value("KBS")
	private String busStand;
	@Value("22")
	private int fair;
	@Value("false")
	private boolean onTime;
	@Value("Bengaluru main Bus Stand")
	private String busFrom;
	@Value("Mangaluru")
	private String busTo;
	@Value("Channarayapattana")
	private String stops;
	@Value("2")
	private int stopAt;
	@Value("11")
	private int interMediateStops;
	@Value("True")
	private boolean ac;
	@Value("True")
	private boolean sleeper;
	@Value("True")
	private boolean semiSleeper;
	@Value("KA01-2268")
	private String registrtation;

	
	
	
	
	
	
	@Override
	public String toString() {
		return "BusStand [busStand=" + busStand + ", fair=" + fair + ", onTime=" + onTime + ", busFrom=" + busFrom
				+ ", busTo=" + busTo + ", stops=" + stops + ", stopAt=" + stopAt + ", interMediateStops="
				+ interMediateStops + ", ac=" + ac + ", sleeper=" + sleeper + ", semiSleeper=" + semiSleeper
				+ ", registrtation=" + registrtation + "]";
	}







	public String driving () {
		System.out.println("Runninng in  Driving ");
		return "Harsh";
	}



	
}
