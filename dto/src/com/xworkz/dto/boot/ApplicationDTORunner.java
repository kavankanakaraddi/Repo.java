package com.xworkz.dto.boot;

import java.time.LocalDate;

import com.xworkz.dto.things.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		ApplicationDTO applicationDTO =new ApplicationDTO();
		applicationDTO.setCreatedOn(LocalDate.of(2009, 01, 01));
		applicationDTO.setDevelopedBy("JAN KOUM");
		applicationDTO.setName("Whatsapp");
		applicationDTO.setSize(35);
		applicationDTO.setVersion(22.233);
		System.out.println(applicationDTO.equals(applicationDTO));
		System.out.println(applicationDTO.toString());
		System.out.println(applicationDTO.hashCode());
	}

}
