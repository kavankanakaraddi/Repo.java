package com.xworkz.application.Service;

import com.xworkz.application.dto.StudentDTO;

public interface StudentService {

	boolean ValidateAndThenSave(StudentDTO dto);

	default StudentDTO find(StudentDTO dto) {
		return null;
	}

	default StudentDTO findByName(String name) {
		return null;
	}

	default StudentDTO findByNameAndId(String name, int id) {
		return null;
	}

	default int getTotal() {
		return 0;
	}
}
