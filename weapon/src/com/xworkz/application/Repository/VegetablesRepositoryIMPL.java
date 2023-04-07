package com.xworkz.application.Repository;

import com.xworkz.application.dto.VegetablesDTO;

public class VegetablesRepositoryIMPL implements VegetablesRepository {
	private VegetablesDTO[] value = new VegetablesDTO[5];
	private int indexValue = 0;

	@Override
	public boolean save(VegetablesDTO dto) {
		if (this.indexValue < this.value.length) {
			this.value[indexValue] = dto;
			this.indexValue++;
			System.out.println("Index value is " + this.indexValue + " " + dto);
			return true;
		} else {
			System.err.println("Memory is full,cannot add more than 5");

			return false;
		}

	}

	@Override
	public VegetablesDTO find(VegetablesDTO dto) {
		for (int i = 0; i < this.indexValue; i++) {
			VegetablesDTO temp = value[i];
			if (temp.equals(dto)) {
				return temp;
			}
		}

		return VegetablesRepository.super.find(dto);
	}

	@Override
	public VegetablesDTO findByName(String name) {
		for (int i = 0; i < this.indexValue; i++) {
			String findName = value[i].getName();
			if (findName.equals(name)) {
				return value[i];
			}
		}
		return VegetablesRepository.super.findByName(name);
	}

	@Override
	public VegetablesDTO priceFindBylocationOrNameOrWeightOrRegion(int weight, String name, String location,
			String region) {
		for (int i = 0; i < this.indexValue; i++) {
			String nam = value[i].getName();
			int weigh = value[i].getWeight();
			String loc = value[i].getLocation();
			String Reg = value[i].getRegion();
			if (nam.equals(name) || weigh == weight || loc.equals(location) || Reg.equals(region)) {
				return value[i];

			}

		}

		return VegetablesRepository.super.priceFindBylocationOrNameOrWeightOrRegion(weight, name, location, region);
	}

	@Override
	public VegetablesDTO[] findAll() {
		if (indexValue != 0) {
			return value;
		}

		return null;

	}

}
