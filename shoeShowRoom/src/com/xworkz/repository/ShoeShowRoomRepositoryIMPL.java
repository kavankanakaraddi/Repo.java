package com.xworkz.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.dto.ShoeShowRoomDTO;

@Component

public class ShoeShowRoomRepositoryIMPL implements ShoeShowRoomRepository {

	private Collection<ShoeShowRoomDTO> collection = new ArrayList<>();

	@Override
	public boolean save(ShoeShowRoomDTO dto) {
		System.out.println("Running save method");
		return this.collection.add(dto);
	}

}
