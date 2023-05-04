package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.dto.PolishDTO;
import com.xworkz.dto.SalesManager;
import com.xworkz.repository.SalesManagerRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServiceIMPL implements SalesManagerService {

	private SalesManagerRepository repository;

	private Validator validator;

	@Override
	public boolean validateAndThenSave(SalesManager dto) {
		if (dto != null) {
			Set<ConstraintViolation<SalesManager>> sales = this.validator.validate(dto);
			System.out.println("Number of Voilations are :: " + sales.size());
			sales.forEach(b -> System.out.println(b.getPropertyPath() + " :: " + b.getMessage()));
			if (sales.isEmpty()) {
				System.out.println("No violations in Service");
				return this.repository.save(dto);

			}

		}
		return false;
	}

}
