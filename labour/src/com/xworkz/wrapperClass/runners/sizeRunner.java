package com.xworkz.wrapperClass.runners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.wrapperClass.configurations.SizeConfiguration;



public class sizeRunner {
	public static void main(String[] args) {
		System.out.println("********************* Wrapper Classes *************************");

		System.out.println("********************* Integer *************************");

		ApplicationContext con = new AnnotationConfigApplicationContext(SizeConfiguration.class);

		SizeConfiguration style = con.getBean(SizeConfiguration.class);
		
		System.out.println(style.shirtSize());
		System.out.println(style.shoeSize());
		System.out.println(style.chappalSize());
		System.out.println(style.helmetSizes());
		System.out.println(style.pantSize());
		System.out.println(style.TshirtSizes());
		System.out.println(style.socksSizes());
		System.out.println(style.shortsSizes());

		System.out.println("********************* Float *************************");

		
		System.out.println(style.cgpaOfAnnesh());
		System.out.println(style.cgpaOfAnita());
		System.out.println(style.cgpaOfRikesh());
		System.out.println(style.cgpaOfBhairavi());
		System.out.println(style.cgpaOfShivu());
		System.out.println(style.cgpaOfBasavaraj());
		System.out.println(style.cgpaOfAnkitha());
		System.out.println(style.cgpaOfSanketh());
		System.out.println(style.cgpaOfAnnesh());

		System.out.println("********************* Long *************************");

		
		System.out.println(style.phoneno5());
		System.out.println(style.phoneno());
		System.out.println(style.phoneno1());
		System.out.println(style.phoneno2());
		System.out.println(style.phoneno3());
		System.out.println(style.phoneno4());
		System.out.println(style.phoneno6());
		System.out.println(style.phoneno7());
		System.out.println(style.phoneno8());

		System.out.println("********************* Short *************************");

		System.out.println(style.price());
		System.out.println(style.price1());
		System.out.println(style.price2());
		System.out.println(style.price3());
		System.out.println(style.price4());
		System.out.println(style.price5());
		System.out.println(style.price6());
		System.out.println(style.price7());
		System.out.println(style.price8());
		
		System.out.println("********************* Double *************************");
		
		System.out.println(style.temp1());
		System.out.println(style.temp2());
		System.out.println(style.temp3());
		System.out.println(style.temp4());
		System.out.println(style.temp5());
		System.out.println(style.temp6());
		System.out.println(style.temp7());
		System.out.println(style.temp8());
		
		System.out.println("********************* Boolean *************************");

		System.out.println(style.punithRaj());
		System.out.println(style.basu());
		System.out.println(style.priyanka());
		System.out.println(style.kiran());
		System.out.println(style.rocks());
		System.out.println(style.praveen());
		System.out.println(style.annesh2());
		System.out.println(style.babu());
		
		System.out.println("********************* Byte *************************");
		
		System.out.println(style.bytocha1());
		System.out.println(style.bytocha2());
		System.out.println(style.bytocha3());
		System.out.println(style.bytocha4());
		System.out.println(style.bytocha5());
		System.out.println(style.bytocha6());
		System.out.println(style.bytocha7());
		System.out.println(style.bytocha8());
		System.out.println(style.bytocha9());
		System.out.println(style.bytocha10());
		
		
		
		System.out.println("********************* Char *************************");
		
		System.out.println(style.code1());
		System.out.println(style.code2());
		System.out.println(style.code3());
		System.out.println(style.code4());
		System.out.println(style.code5());
		System.out.println(style.code6());
		System.out.println(style.code7());
		System.out.println(style.code8());
		System.out.println(style.code9());

	

	}

}
