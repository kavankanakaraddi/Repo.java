package com.xworkz.weapon.service;

import java.time.LocalDate;

import com.xworkz.weapon.Exception.InvalidFestivalException;
import com.xworkz.weapon.Repository.FestivalRepository;
import com.xworkz.weapon.Repository.FestivalRepositoryimpl;
import com.xworkz.weapon.dto.FestivalDTO;
import com.xworkz.weapon.util.FestivalValidUtil;

public class FestivalServiceimpl implements FestivalService{
	private FestivalRepository festivalRepository;

	public FestivalServiceimpl(FestivalRepository festivalRepository) {
		this.festivalRepository = festivalRepository;
	}

	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException {
		if (dto != null) {
			System.out.println("DTO is not null,so Validate");
			int id = dto.getId();
			String name = dto.getName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			String sweet = dto.getSweet();
			String godName = dto.getGodName();

			boolean validId = false;
			boolean validName = false;
			boolean validStartDate = false;
			boolean validEndDate = false;
			boolean validSweet = false;
			boolean validGodName = false;

			if (FestivalValidUtil.validId(id)) {
				System.out.println("Id is valid");
				validId = true;
			} else {
				System.err.println("Id is invalid");
			}
			if (FestivalValidUtil.validString(name)) {
				System.out.println("Name is valid");
				validName = true;
			} else {
				System.err.println("Name is Invalid");
			}

			if (FestivalValidUtil.validDate(startDate)) {
				System.out.println("StartDate is valid");
				validStartDate = true;
			} else {
				System.err.println("StartDate is Invalid");
			}
			if (FestivalValidUtil.validDate(endDate)) {
				System.out.println("EndDate is valid");
				validEndDate = true;
			} else {
				System.err.println("EndaDate is Invalid");
			}
			if (FestivalValidUtil.validString(sweet)) {
				System.out.println("Sweet is valid");
				validSweet = true;
			} else {
				System.err.println("Sweet is invalid");
			}
			if (FestivalValidUtil.validString(godName)) {
				System.out.println("GodName is valid");
				validGodName = true;
			} else {
				System.err.println("GodName is invalid");
			}
			if (FestivalValidUtil.validFalg(validId, validName, validStartDate, validEndDate, validSweet,
					validGodName)) {
				System.out.println("Validation Done so saved");
				boolean exist = this.festivalRepository.isExists(dto);
					if(!exist) {
						boolean save = this.festivalRepository.save(dto);
						System.out.println("DTO is Not Duplicate So Save "+dto);
						return save;
					}else {
						System.err.println("DTO is Duplicate So Do Not Save  "+dto);
					}
			
			} else {
				throw new InvalidFestivalException("Data is Invalid");
			}
		} else {
			System.err.println("DTO is null so dont validate");
		}
		return false;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return this.festivalRepository.getCount();
	}
	
}


