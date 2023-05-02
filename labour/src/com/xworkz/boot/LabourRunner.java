package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springConfiguration.Config;
import com.xworkz.things.BusStand;
import com.xworkz.things.Phone;

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

		System.out.println("------- Next Task started ------------");

		System.out.println("----------phone--------------");
		Phone phone = text.getBean(Phone.class);
		System.out.println(phone);
		System.out.println("Quulity of phone is:" + phone.quality());

		System.out.println("----------BusStand--------------");
		 BusStand stand = text.getBean(BusStand.class);
		System.out.println(stand);
		System.out.println(" Driving  is:" +stand.driving());

	}

}