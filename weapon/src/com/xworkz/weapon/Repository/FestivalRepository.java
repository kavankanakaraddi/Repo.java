package com.xworkz.weapon.Repository;

import com.xworkz.weapon.dto.FestivalDTO;

public interface FestivalRepository {
		boolean save(FestivalDTO dto);
		
		default boolean isExists (FestivalDTO dto) {
			return false;
			
		}
		default int getCount() {
			return 0;
		}
	}


