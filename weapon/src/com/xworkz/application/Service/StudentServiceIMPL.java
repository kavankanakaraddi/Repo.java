package com.xworkz.application.Service;

import com.xworkz.application.dto.StudentDTO;

public class StudentServiceIMPL implements StudentService{

	@Override
	public boolean ValidateAndThenSave(StudentDTO dto) {
		if(dto !=null) {
			System.out.println("dto is not null so validate");
			int id = dto.getId();
			String name = dto.getName();

			
		}
		return false;
	}

}
