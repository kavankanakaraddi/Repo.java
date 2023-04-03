package com.xworkz.weapon.Repository;

import com.xworkz.weapon.Exception.FestivalMemoryFullException;
import com.xworkz.weapon.dto.FestivalDTO;
import com.xworkz.weapon.service.FestivalRepository;

public class FestivalRepositoryimpl implements FestivalRepository {
	private FestivalDTO[] festivalDTO = new FestivalDTO[3];
	private int indexFestivalDTO = 0;

	@Override
	public boolean save(FestivalDTO dto) {
		if (this.indexFestivalDTO < this.festivalDTO.length) {
			this.festivalDTO[indexFestivalDTO] = dto;
			indexFestivalDTO++;
			return true;

		} else {
			System.err.println("Memory is full,cannot add more files,max allowed is 5");
			throw new FestivalMemoryFullException("Memory is full cannot add festivals..");
		}
	}

	@Override
	public boolean isExists(FestivalDTO dto) {
		if (this.indexFestivalDTO == 0) {
			System.out.println("First Elements Will not Check");
			return false;
		}else{
			System.out.println("First Elements Onwords Will Check");
			for (int i=0;i<this.indexFestivalDTO;i++) {
			FestivalDTO	temp=festivalDTO[i];
				if(temp.equals(dto)) {
					System.out.println("FestivalDTO is Already Exists");
					return true;
				}
			}
		}

		return FestivalRepository.super.isExists(dto);
	}
	@Override
	public int getCount() {
		
		return this.indexFestivalDTO;
	}
}
S
