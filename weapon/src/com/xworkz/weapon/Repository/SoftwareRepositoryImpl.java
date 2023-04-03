package com.xworkz.weapon.Repository;

import java.util.Iterator;

import com.xworkz.weapon.dto.SoftwareDTO;

public class SoftwareRepositoryImpl implements SoftwareRepository {
	private SoftwareDTO[] softwareDTO = new SoftwareDTO[5];
	private int index = 0;

	@Override
	public boolean save(SoftwareDTO dto) {
		if (index < softwareDTO.length) {
			softwareDTO[index] = dto;
			index++;
			System.out.println("Space is available");
			return true;
		} else {
			System.err.println("Space is not available");
		}
		return false;
	}

	@Override
	public boolean isExists(SoftwareDTO dto) {
		if (index == 0) {
			System.out.println("First index value will not check");
			return false;
		} else {
			System.out.println("First index onwards will check");
			for (int i = 0; i < softwareDTO.length; i++) {
				SoftwareDTO temp = softwareDTO[i];
				if (temp.equals(dto)) {
					System.err.println("dto is already exist" + dto);
					return true;
				}

			}
		}
		return SoftwareRepository.super.isExists(dto);
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.index;
	}

	@Override
	public SoftwareDTO findById(int id) {

		for (int i = 0; i < this.softwareDTO.length; i++) {
			SoftwareDTO ref = softwareDTO[i];
			if (ref.getId() == id) {
				System.out.println("DTO is found for id" + id);
				return ref;
			} else {
				System.out.println("DTO is not found for id" + id);
				return null;

			}
		}

		return SoftwareRepository.super.findById(id);
	}

	@Override
	public SoftwareDTO findByName(String name) {
		for (int i = 0; i < this.softwareDTO.length; i++) {
			SoftwareDTO rog = softwareDTO[i];
			if (rog.getName() == name) {
				System.out.println("DTO is found for name" + name);
				return rog;
			}
		}
		return SoftwareRepository.super.findByName(name);
	}

	@Override
	public SoftwareDTO findByNameAndId(String name, int id) {
		for (int i = 0; i < softwareDTO.length; i++) {
			SoftwareDTO nand = softwareDTO[i];
			if (nand.getId() == id)
				;
			if (nand.getName() == name)
				;
			System.out.println("DTO is found id and name" + id + name);
		}

		return SoftwareRepository.super.findByNameAndId(name, id);
	}
}