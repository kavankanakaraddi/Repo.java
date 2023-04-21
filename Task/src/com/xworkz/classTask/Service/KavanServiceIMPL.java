package com.xworkz.classTask.Service;


import static com.xworkz.classTask.Util.KavanUtil.*;

import com.xworkz.classTask.dto.KavanDTO;
import com.xworkz.classTask.repository.KavanRepository;


public class KavanServiceIMPL implements KavanService {

	private KavanRepository kavanRepository;

	public KavanServiceIMPL(KavanRepository kavanRepository) {
		this.kavanRepository = kavanRepository;
	}

	@Override
	public boolean validateAndThenSave(KavanDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null so validate");

			String education = dto.getEducation();
			int age = dto.getAge();
			String location = dto.getLocation();
			double weight = dto.getWeight();
			int pincode = dto.getPincode();

			boolean validEducation = false;
			boolean validAge = false;
			boolean validalocation = false;
			boolean validWeight = false;
			boolean validPincode = false;

			if (validInt(age)) {
				System.out.println("Valid Age");
				validAge = true;
			} else {
				System.err.println("invalid Age");
			}
			if (validString(education)) {
				System.out.println("Valid Education");
				validEducation = true;
			} else {
				System.err.println("Invalid Education");
			}
			if (validString(location)) {
				System.out.println("Valid Location");
				validalocation = true;
			} else {
				System.err.println("Invalid Location");
			}
			if (validDouble(weight)) {
				System.out.println("Valid Weight");
				validWeight = true;
			} else {
				System.err.println("Invalid Weight");
			}
			if (validInt(pincode)) {
				System.out.println("Valid pincode");
				validPincode = true;
			} else {
				System.err.println("invalid pincode");
			}
			if (validFlag(validEducation,validAge,validalocation,validWeight,validPincode)) {
				return this.kavanRepository.save(dto);
			}


		}
		return false;
	}


}
