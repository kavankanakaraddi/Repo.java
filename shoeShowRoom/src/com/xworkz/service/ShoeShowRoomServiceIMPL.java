package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.xworkz.dto.ShoeShowRoomDTO;
import com.xworkz.repository.ShoeShowRoomRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ShoeShowRoomServiceIMPL implements ShoeShowRoomService {

	private ShoeShowRoomRepository repository;
	private Validator validator;

	@Override
	public boolean validateAndThenSave(ShoeShowRoomDTO dto) {
		if (dto != null) {
			Set<ConstraintViolation<ShoeShowRoomDTO>> shoe = this.validator.validate(dto);
			System.out.println("Number of Voilations are :: " + shoe.size());
			shoe.forEach(a -> System.out.println(a.getPropertyPath() + " :: " + a.getMessage()));

			if (shoe.isEmpty()) {
				System.out.println("No violations");
				return this.repository.save(dto);
			}

		} else {
			System.err.println("dto is null");
		}
		return false;
	}

}
