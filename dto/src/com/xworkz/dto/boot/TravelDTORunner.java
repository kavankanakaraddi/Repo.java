package com.xworkz.dto.boot;

import java.time.LocalDate;

import com.xworkz.dto.things.TravelDTO;

public class TravelDTORunner {

	public static void main(String[] args) {
		TravelDTO travelDTO = new TravelDTO();
		travelDTO.setAmount(25000);
		travelDTO.setName("Nirmal");
		travelDTO.setStartedOn(LocalDate.of(2000,01,01));
		System.out.println(travelDTO.equals(travelDTO));
		System.out.println(travelDTO.toString());
		System.out.println(travelDTO.hashCode());
	}

}
