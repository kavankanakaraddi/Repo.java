package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dto.PolishDTO;
import com.xworkz.dto.SalesManager;
import com.xworkz.service.PolishService;
import com.xworkz.service.PolishServiceIMPL;
import com.xworkz.service.SalesManagerService;
import com.xworkz.service.SalesManagerServiceIMPL;
import com.xworkz.springConfiguration.ShoeShowRoomSpringConfiguration;

public class PolishRunner {

	public static void main(String[] args) {

		ApplicationContext cont = new AnnotationConfigApplicationContext(ShoeShowRoomSpringConfiguration.class);
		 PolishService polish  = cont.getBean(PolishServiceIMPL.class);
		 
		 PolishDTO dto = new PolishDTO("Bata", 5, "Brown");
		 System.out.println(dto);
		 
		 boolean save= polish.validateAndThenSave(dto);
		 System.out.println(save);
		 
		 
		 ApplicationContext cont1 = new AnnotationConfigApplicationContext(ShoeShowRoomSpringConfiguration.class);
		 SalesManagerService manager = cont1.getBean(SalesManagerService.class);
		 
		 SalesManager dto1 = new SalesManager("Annesh", 2, 36, "BE");
		 System.out.println(dto1);
		 
		boolean save1 =  manager.validateAndThenSave(dto1);
		 System.out.println(save1);

		 
		 
		 
		 
	}

}