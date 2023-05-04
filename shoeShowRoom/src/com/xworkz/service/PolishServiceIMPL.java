package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.dto.PolishDTO;
import com.xworkz.repository.PolishRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceIMPL implements PolishService {

	private PolishRepository repository;

	private Validator validator;

	@Override
	public boolean validateAndThenSave(PolishDTO dto) {
		if (dto != null) {
			Set<ConstraintViolation<PolishDTO>> pol =this.validator.validate(dto);
			System.out.println("Number of Voilations are :: " + pol.size());
			pol.forEach(b -> System.out.println(b.getPropertyPath() + " :: " + b.getMessage()));
			if (pol.isEmpty()) {
				System.out.println("No violations in Service");
				return this.repository.save(dto);

			}

		}
		return false;
	}

}
