package com.xworkz.weapon.Repository;

import com.xworkz.weapon.dto.SoftwareDTO;

public interface SoftwareRepository {

	boolean save(SoftwareDTO dto);

	default boolean isExists(SoftwareDTO dto) {
		return false;
	}

	default int total() {
		return 0;
	}

	default SoftwareDTO findById(int id) {
		return null;
	}

	default SoftwareDTO findByName(String name) {
		return null;

	}
	default SoftwareDTO findByNameAndId(String name,int id) {
		return null;
	}

}
