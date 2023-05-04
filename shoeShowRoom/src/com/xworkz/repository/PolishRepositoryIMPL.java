package com.xworkz.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.dto.PolishDTO;

@Component
public class PolishRepositoryIMPL implements PolishRepository{
	
	Collection<PolishDTO> coll = new ArrayList<>();
	
	public PolishRepositoryIMPL() {
		// TODO Auto-generated constructor stub
	}

	public PolishRepositoryIMPL(Collection<PolishDTO> coll) {
		super();
		this.coll = coll;
	}



	@Override
	public boolean save(PolishDTO dto) {
		System.out.println("Running save method");

		return this.coll.add(dto);
	}

}
