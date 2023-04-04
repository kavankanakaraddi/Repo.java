package com.xworkz.application.Service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exceptions.InvaliDataDesertException;

public interface DesertService {
	boolean validateAndThenSave(DesertDTO dto) throws InvaliDataDesertException;

	default DesertDTO find(DesertDTO dto) throws InvaliDataDesertException{
		return null;

	}

	default DesertDTO findByName(String name) throws InvaliDataDesertException{
		return null;

	}

	default String findAreaByName(String name) throws InvaliDataDesertException{
		return null;

	}

	default DesertDTO findByNameAndCountryAndArea(String name, String country, String area) throws InvaliDataDesertException{
		return null;

	}

	default int getTotal() {
		return 0;
	}


}
