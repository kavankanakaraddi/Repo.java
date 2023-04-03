package com.xworkz.weapon.service;

import com.xworkz.weapon.Exception.InvalidFestivalException;
import com.xworkz.weapon.dto.FestivalDTO;

public interface FestivalService {
	boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException ;
	
	default int count() {
		return 0;
	}

}
