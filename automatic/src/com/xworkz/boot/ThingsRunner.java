package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfigurations;
import com.xworkz.thingss.Camera;
import com.xworkz.thingss.EntryFees;
import com.xworkz.thingss.Guide;
import com.xworkz.thingss.Museum;
import com.xworkz.thingss.Security;
import com.xworkz.thingss.SensoredDoor;
import com.xworkz.thingss.Thing;

public class ThingsRunner {

	public static void main(String[] args) {

		ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfigurations.class);

		Thing thing = con.getBean(Thing.class);
		System.out.println(thing);

		Security sec = con.getBean(Security.class);
		System.out.println(sec);

		Guide guide = con.getBean(Guide.class);
		System.out.println(guide);

		Camera cam = con.getBean(Camera.class);
		System.out.println(cam);

		SensoredDoor door = con.getBean(SensoredDoor.class);
		System.out.println(door);
		
		EntryFees fees = con.getBean(EntryFees.class);
		System.out.println(fees);
		
		Museum mus = con.getBean(Museum.class);
		System.out.println(mus);

	}

}
