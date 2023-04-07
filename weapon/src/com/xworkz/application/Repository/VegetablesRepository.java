package com.xworkz.application.Repository;

import com.xworkz.application.dto.VegetablesDTO;

public interface VegetablesRepository {
	boolean save(VegetablesDTO dto);

	default VegetablesDTO find(VegetablesDTO dto) {
		return null;

	}
	default VegetablesDTO findByName( String name) {
		return null;

	}
	default VegetablesDTO priceFindByName (double price,String name) {
		return null;
	}
	default VegetablesDTO[] findAll() {
		return null;
	}
	default VegetablesDTO priceFindBylocationOrNameOrWeightOrRegion (int weight,String name,String location,String region) {
		return null;
	}

}
