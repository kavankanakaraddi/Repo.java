package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.WonderLaConfig;
import com.xworkz.spring.things.Alcohol;
import com.xworkz.spring.things.Ball;
import com.xworkz.spring.things.Gym;
import com.xworkz.spring.things.Office;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Train;
import com.xworkz.spring.things.WonderLa;
import com.xworkz.spring.things.Zoo;

public class WondeLaRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(WonderLaConfig.class);
		/*ApplicationContext context1 = new AnnotationConfigApplicationContext(Zoo.class);
		ApplicationContext context2 = new AnnotationConfigApplicationContext(Ball.class);
		ApplicationContext context3 = new AnnotationConfigApplicationContext(Alcohol.class);
		ApplicationContext context4 = new AnnotationConfigApplicationContext(Gym.class);
		ApplicationContext context5 = new AnnotationConfigApplicationContext(Park.class);
		ApplicationContext context6 = new AnnotationConfigApplicationContext(Train.class);
		ApplicationContext context7 = new AnnotationConfigApplicationContext(Office.class);*/




	}

}
