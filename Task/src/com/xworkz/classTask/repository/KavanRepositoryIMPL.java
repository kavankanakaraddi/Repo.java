package com.xworkz.classTask.repository;

import com.xworkz.classTask.dto.KavanDTO;

public class KavanRepositoryIMPL implements KavanRepository{
	
	private KavanDTO[] val = new KavanDTO[4];
	private int indexValue = 0;

	@Override
	public boolean save(KavanDTO dto) {
		if (this.indexValue < this.val.length) {
			this.val[indexValue] = dto;
			this.indexValue++;
			System.out.println("Index value is " + this.indexValue + " " + dto);
			return true;
		} else {
			System.err.println("Memory is full,cannot add more files,max allowed is 23");
		}

	
		return false;
	}
	@Override
	public KavanDTO findByEducation(String name) {

		for (int i = 0; i < this.indexValue; i++) {
			String findName = val[i].getEducation();
			if (findName.equals(name)) {
				return val[i];
			}
		}
		
		return KavanRepository.super.findByEducation(name);
	}
	
}
