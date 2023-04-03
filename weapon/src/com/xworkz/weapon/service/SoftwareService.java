package com.xworkz.weapon.service;

import com.xworkz.weapon.dto.SoftwareDTO;

public interface SoftwareService {
boolean validateAndThenSave(SoftwareDTO dto);
	
	default int count() {
		return 0;
	}

}
