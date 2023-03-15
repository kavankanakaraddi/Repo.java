package com.xworkz.weapon.service;

import java.time.LocalDate;

import com.xworkz.weapon.constants.Type;
import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponServiceIMPL implements WeaponService {

	@Override
	public boolean validateAndThenSave(WeaponDTO dto) {
		System.out.println("Running Weapon DTO ");
		if (dto != null) {
			System.out.println("Weapondto Validate is Valid");
			int weaponID = dto.getWeaponID();
			String name = dto.getName();
			Type type = dto.getType();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			String manufacturedBy = dto.getManufacturedBy();
			LocalDate manufacturedYear = dto.getManufacturedYear();
			String usedBy = dto.getUsedBy();
			String usedFor = dto.getUsedFor();
			double weight = dto.getWeight();

			boolean validateID = false;
			boolean validateName = false;
			boolean validateType = false;
			boolean validateCost = false;
			boolean validateMaterial = false;
			boolean validateMadeBy = false;
			boolean validateManufacturedBy = false;
			boolean validateManufacturedYear = false;
			boolean validateUsedBy = false;
			boolean validateUsedFor = false;
			boolean validateWeight = false;

			if (weaponID > 0 && weaponID < 100) {
				System.out.println("Valid weaponID");
				return true;
			} else {
				System.err.println("Invalid weaponID");

			}
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 15) {
				System.out.println("Valid Name");
				return true;

			} else {
				System.err.println("Invalid Name");
			}
			if (type != null) {
				System.out.println("Valid Type ");
				return true;

			} else {
				System.err.println("Invalid Type");
			}
			if (cost > 0 && cost < 100) {
				System.out.println("Valid Cost");
				return true;

			} else {
				System.err.println("Invalid Cost");
			}
			if (material != null && !material.isEmpty() && material.length() > 3 && material.length() < 15) {
				System.out.println("Valid material");
				return true;

			} else {
				System.err.println("Invalid material");
			}
			if (madeBy != null && !madeBy.isEmpty() && madeBy.length() > 3 && madeBy.length() < 15) {
				System.out.println("Valid madeBy");
				return true;

			} else {
				System.err.println("Invalid madeBy");
			}
			if (manufacturedBy != null && !manufacturedBy.isEmpty() && manufacturedBy.length() > 3
					&& manufacturedBy.length() < 15) {
				System.out.println("Valid manufacturedBy");
				return true;

			} else {
				System.err.println("Invalid manufacturedBy");
			}
			if (usedFor != null && !usedFor.isEmpty() && usedFor.length() > 3 && usedFor.length() < 45) {
				System.out.println("Valid usedFor");
				return true;

			} else {
				System.err.println("Invalid usedFor");
			}
			if (weight > 250 && weight < 1000) {
				System.out.println("Valid weight");
				return true;

			} else {
				System.err.println("Invalid weight");
			}
			LocalDate today = LocalDate.now();
			LocalDate after = LocalDate.of(2021, 01, 01);
			if (manufacturedYear != null && manufacturedYear.isEqual(today) && manufacturedYear.isAfter(after)) {
				System.out.println("Valida manufacturedYear");
				return true;

			} else {
				System.err.println("InValid manufacturedYear");
			}
			if (validateID && validateName && validateType && validateCost && validateMaterial && validateMadeBy
					&& validateManufacturedBy && validateManufacturedYear && validateUsedBy && validateUsedFor
					&& validateWeight) {
				System.out.println("Validation Done");
				return true;
			} else {
				System.err.println("Validaton not Done");
				return false;
			}

		} else {
			System.err.println("Weapon dto is null and invalid ");
		}
		return false;
	}

}
