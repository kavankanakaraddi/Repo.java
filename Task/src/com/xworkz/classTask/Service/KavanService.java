package com.xworkz.classTask.Service;

import com.xworkz.classTask.dto.KavanDTO;

public interface KavanService {

	boolean validateAndThenSave(KavanDTO dto);

	default KavanDTO findByName(String name) {
		return null;

	}

}
