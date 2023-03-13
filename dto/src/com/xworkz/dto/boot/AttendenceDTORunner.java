package com.xworkz.dto.boot;

import java.time.LocalDate;

import com.xworkz.dto.things.AttendenceDTO;

public class AttendenceDTORunner {

	public static void main(String[] args) {

		AttendenceDTO attendenceDTO = new AttendenceDTO();
		attendenceDTO.setMaintainedAt("X-WORKZZ");
		attendenceDTO.setMaintainedBy("Shanthanu");
		attendenceDTO.setMaintainedFrom(LocalDate.of(2023,2,28));
		System.out.println(attendenceDTO.equals(attendenceDTO));
		System.out.println(attendenceDTO.toString());
		System.out.println(attendenceDTO.hashCode());
	}

}
