package com.xworkz.saloon.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.saloon.configuration.SaloonConfig;
import com.xworkz.saloon.things.Barber;
import com.xworkz.saloon.things.Chair;
import com.xworkz.saloon.things.HairDryer;
import com.xworkz.saloon.things.Mirror;
import com.xworkz.saloon.things.Saloon;
import com.xworkz.saloon.things.Scissor;
import com.xworkz.saloon.things.ShavingCream;
import com.xworkz.saloon.things.Trimmer;

public class SaloonRunner {

	public static void main(String[] args) {

		ApplicationContext con = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(con.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(con.getBeanDefinitionCount());
		System.out.println(con.getBean(Saloon.class));
		Stream.of(con).forEach(System.out::println);

		ApplicationContext cont = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(cont.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(con.getBeanDefinitionCount());
		System.out.println(con.getBean(Scissor.class));
		Stream.of(cont).forEach(System.out::println);

		ApplicationContext conte = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(conte.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(conte.getBeanDefinitionCount());
		System.out.println(conte.getBean(Chair.class));
		Stream.of(conte).forEach(System.out::println);

		ApplicationContext contex = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(contex.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(contex.getBeanDefinitionCount());
		System.out.println(contex.getBean(ShavingCream.class));
		Stream.of(contex).forEach(System.out::println);

		ApplicationContext context = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(context.getBean(Mirror.class));
		Stream.of(context).forEach(System.out::println);

		ApplicationContext context1 = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(context1.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context1.getBeanDefinitionCount());
		System.out.println(context1.getBean(HairDryer.class));
		Stream.of(context1).forEach(System.out::println);

		ApplicationContext context2 = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(context2.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context2.getBeanDefinitionCount());
		System.out.println(context2.getBean(Trimmer.class));
		Stream.of(context2).forEach(System.out::println);

		ApplicationContext context3 = new AnnotationConfigApplicationContext(SaloonConfig.class);
		Stream.of(context3.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context3.getBeanDefinitionCount());
		System.out.println(context3.getBean(Barber.class));
		Stream.of(context3).forEach(System.out::println);

		
	}

}
