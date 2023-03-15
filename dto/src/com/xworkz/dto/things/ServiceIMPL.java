package com.xworkz.dto.things;

import java.time.LocalDate;

public class ServiceIMPL implements ApplicationService {

	@Override
	public boolean validateAndSave(Application1DTO dto) {
		if (dto != null) {
			System.out.println("dto is not null, will validate the properties");
			String name = dto.getName();
			LocalDate date = dto.getCreatedOn();
			double size = dto.getSize();
			String developedBy = dto.getDevelopedBy();
			double version = dto.getVersion();
			int price = dto.getPrice();
			LocalDate date1 = dto.getCreatedOn();
			double currentVersionDate = dto.getVersion();
			LocalDate trailDays = dto.getTrailDays();
			Type type = dto.getType();
			double minProcessorSpeed = dto.getMinProcessorSpeed();
			int minRamSpeedRequired = dto.getMinRamSpeedRequired();
			boolean internet = dto.isInternet();
			int ageLimit = dto.getAgeLimit();
			int noOfDownloads = dto.getNoOfDownloads();
			double rating = dto.getRating();

			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("Name is Valid");
			} else {
				System.out.println("Name is Invalid");
			}
			LocalDate tommorrow = LocalDate.of(2023, 01, 01);
			if (date1 != null && date1.isBefore(tommorrow)) {
				System.out.println("Valid Date");
			} else {
				System.out.println("Invalid Date");
			}
			if (developedBy != null && !name.isEmpty() && name.length() > 3 && name.length() < 15) {
				System.out.println("DevelopedBy Is Valid");
			}
			LocalDate  createdOn=LocalDate.of(2006, 01, 01);
			if (createdOn!=null && createdOn.isEqual(createdOn) ) {
				System.out.println(" Created Date is Valid");
			}else {
				System.out.println("Invalid Date");
			}
		} else {
			System.out.println("dto is Null ,Cannot Continue");
		}
		return false;

	}
}
