package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dto.ShoeShowRoomDTO;
import com.xworkz.service.ShoeShowRoomService;
import com.xworkz.springConfiguration.ShoeShowRoomSpringConfiguration;

public class ShoeShowRoomRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShoeShowRoomSpringConfiguration.class);
		ShoeShowRoomService roomService = spring.getBean(ShoeShowRoomService.class);

		ShoeShowRoomDTO dto = new ShoeShowRoomDTO(12, "Annesh Boot Company", "Dubai", "GST 12345");
		System.out.println(dto);

		boolean saved = roomService.validateAndThenSave(dto);
		System.out.println(saved);

	}

}
