package com.xworkz.weapon.Repository;

import com.xworkz.weapon.Exception.FestivalMemoryFullException;
import com.xworkz.weapon.dto.FestivalDTO;
import com.xworkz.weapon.service.FestivalRepository;

public class FestivalRepositoryimpl implements FestivalRepository{
	private FestivalDTO[] festivalDTO=new FestivalDTO[3];
	private int indexFestivalDTO=0;
	
	@Override
	public boolean save(FestivalDTO dto) {
		if(this.indexFestivalDTO<this.festivalDTO.length) {
			this.festivalDTO[indexFestivalDTO]=dto;
			indexFestivalDTO++;
			return true;
			
		}else {
			System.err.println("Memory is full,cannot add more files,max allowed is 5");
			throw new FestivalMemoryFullException("Memory is full cannot add festivals..");
		}
	}

}


