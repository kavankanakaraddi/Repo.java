package com.xworkz.classTask.repository;

import com.xworkz.classTask.dto.KavanDTO;

public interface KavanRepository {
	boolean save(KavanDTO dto);
	
	default KavanDTO findByEducation(String name) {
		return null;

	}


}
