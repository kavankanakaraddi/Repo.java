package com.xworkz.boot;

import java.util.stream.Stream;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springConfiguration.Config;
import com.xworkz.things.Akshatha;
import com.xworkz.things.Annesh;
import com.xworkz.things.Ashwini;
import com.xworkz.things.BusStand;
import com.xworkz.things.Jayanth;
import com.xworkz.things.Kavan;
import com.xworkz.things.Kirthana;
import com.xworkz.things.Phone;
import com.xworkz.things.Prashanth;
import com.xworkz.things.Rikesh;
import com.xworkz.things.Sanketh;
import com.xworkz.things.Savithri;
import com.xworkz.things.Shwetha;
import com.xworkz.things.Savithri;

public class LabourRunner {

	public static void main(String[] args) {
		ApplicationContext text = new AnnotationConfigApplicationContext(Config.class);
		System.out.println(text.getBeanDefinitionCount());

		Config dt = text.getBean(Config.class);
		System.out.println(" Name is   :: " + dt.roomName());
		System.out.println(" Location  is :: " + dt.location());
		System.out.println(" Street  is :: " + dt.street());
		System.out.println(" Area  is :: " + dt.area());
		System.out.println(" nearBy  is :: " + dt.nearBy());
		System.out.println(" Boy  is :: " + dt.boy());
		System.out.println(" Girl  is :: " + dt.girl());
		System.out.println(" School  is :: " + dt.school());
		System.out.println(" College  is :: " + dt.college());
		System.out.println(" Degree  is :: " + dt.Degree());
		System.out.println(" Native  is :: " + dt.nativee());
		System.out.println(" Current Place  is :: " + dt.currentPlace());
		System.out.println(" District  is :: " + dt.district());

		System.out.println("*************************************************************");

		System.out.println("------- *************Next Task started***************** ------------");

		System.out.println("----------*******  phone  *********--------------");
		Phone phone = text.getBean(Phone.class);
		System.out.println(phone);
		System.out.println("Quulity of phone is:" + phone.quality());

		System.out.println("----------**************BusStand****************--------------");
		BusStand stand = text.getBean(BusStand.class);
		System.out.println(stand);
		System.out.println(" Driving  is:" + stand.driving());

		System.out.println("----------**************Kavan****************--------------");
		Kavan kavan = text.getBean(Kavan.class);
		System.out.println(kavan);

		System.out.println("----------**************Rikesh****************--------------");
		Rikesh rikesh = text.getBean(Rikesh.class);
		System.out.println(rikesh);
		
		//System.out.println("===");
//Stream.of(text.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println("----------**************Annesh****************--------------");
		Annesh annesh = (Annesh) text.getBean("annesh");
		System.out.println(annesh);
		
		System.out.println("----------**************Akshatha****************--------------");
		 Akshatha aksh = text.getBean(Akshatha.class);
		System.out.println(aksh);
		
		

		System.out.println("----------**************Savithri****************--------------");
		 Savithri sav = text.getBean(Savithri.class);
		System.out.println(sav);
		


		System.out.println("----------**************Jayanth****************--------------");
		  Jayanth jay = text.getBean(Jayanth.class);
		System.out.println(jay);
		


		System.out.println("----------**************Sanketh****************--------------");
		Sanketh san = text.getBean(Sanketh.class);
		System.out.println(san);
		

		System.out.println("----------**************Prashanth****************--------------");
		Prashanth par = text.getBean(Prashanth.class);
		System.out.println(par);
		

		System.out.println("----------************** Ashwini  ****************--------------");
		Ashwini ash = text.getBean(Ashwini.class);
		System.out.println(ash);
		
		System.out.println("----------************** Shwetha  ****************--------------");
		Shwetha shw = text.getBean(Shwetha.class);
		System.out.println(shw);
		

		System.out.println("----------************** Kirthana  ****************--------------");
		Kirthana kir = text.getBean(Kirthana.class);
		System.out.println(kir);
		
		
	}

}