package com.xworkz.application.Service;

import static com.xworkz.application.Util.DesertValidUtil.*;

import com.xworkz.application.Repository.VegetablesRepository;
import com.xworkz.application.dto.VegetablesDTO;

public class VegetablesServiceIMPL implements VegetablesService {
	private VegetablesRepository vegetablesRepository;

	public VegetablesServiceIMPL(VegetablesRepository vegetablesRepository) {
		super();
		this.vegetablesRepository = vegetablesRepository;
	}

	@Override
	public boolean validateAndThenSave(VegetablesDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null so validate");
			String name = dto.getName();
			int price = dto.getPrice();
			int weight = dto.getWeight();
			String location = dto.getLocation();
			String region = dto.getRegion();

			boolean validName = false;
			boolean validPrice = false;
			boolean validWeight = false;
			boolean validLocation = false;
			boolean validRegion = false;

			if (validString(name)) {
				System.out.println("Valid Name");
				validName = true;
			} else {
				System.err.println("Invalid Name");
			}
			if (validString(location)) {
				System.out.println("Valid location");
				validLocation = true;
			} else {
				System.err.println("Invalid location");
			}
			if (validString(region)) {
				System.out.println("Valid region");
				validRegion = true;
			} else {
				System.err.println("Invalid region");
			}
			if (validInt(price)) {
				System.out.println("Valid Price");
				validPrice = true;
			} else {
				System.err.println("Invalid price");
			}
			if (validInt(weight)) {
				System.out.println("Valid Weight");
				validWeight = true;
			} else {
				System.err.println("Invalid Weight");
			}
			if (validFlag(validName, validWeight, validLocation, validRegion, validPrice)) {
				System.out.println("DTO is valid and Data can be saved : ");
				this.vegetablesRepository.save(dto);
				return true;

			} else {
				System.out.println("DTO is invalid cannot save : ");
			}

		}

		return false;

	}

	@Override
	public VegetablesDTO find(VegetablesDTO dto) {
		if (dto != null) {
			VegetablesDTO fin = this.vegetablesRepository.find(dto);
			return fin;
		}

		return VegetablesService.super.find(dto);
	}

	@Override
	public VegetablesDTO findByName(String name) {
		if (validString(name)) {
			VegetablesDTO byName = this.vegetablesRepository.findByName(name);
			return byName;
		}
		return VegetablesService.super.findByName(name);
	}

	@Override
	public VegetablesDTO priceFindByName(double price, String name) {
		if (validString(name) && validInt(35)) {
			VegetablesDTO ref = this.vegetablesRepository.priceFindByName(price, name);
			return ref;

		}
		return VegetablesService.super.priceFindByName(price, name);
	}

	@Override
	public VegetablesDTO priceFindBylocationOrNameOrWeightOrRegion(int weight, String name, int price, String location,
			String region) {
		if (validString(location) && validInt(weight) && validString(region) && validString(name)) {
			VegetablesDTO priceFindByAll = this.vegetablesRepository.priceFindBylocationOrNameOrWeightOrRegion(weight,
					name, location, region);
			return priceFindByAll;

		}

		return VegetablesService.super.priceFindBylocationOrNameOrWeightOrRegion(weight, name, price, location, region);
	}

	@Override
	public VegetablesDTO[] findAll() {
		VegetablesDTO[] ownDTO = new VegetablesDTO[5];
		VegetablesDTO[] repoDTO = this.vegetablesRepository.findAll();
		int i = 0;
		if (i < repoDTO.length) {
			for (int j = 0; j < ownDTO.length; j++) {
				if (repoDTO[j] != null) {
					ownDTO[i] = repoDTO[j];
					System.out.println(ownDTO[i]);
					i++;
				}
			}
		}
		return ownDTO;
	}
}
