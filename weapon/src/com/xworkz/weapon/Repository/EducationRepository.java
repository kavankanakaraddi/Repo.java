package com.xworkz.weapon.Repository;

import java.time.LocalDate;

import com.xworkz.weapon.dto.EducationDTO;

public interface EducationRepository {
	public interface EducationRepo {

		boolean save(EducationDTO repo);

		default boolean isExist(EducationDTO dto) {
			return false;
		}

		EducationDTO find(EducationDTO dto);

		EducationDTO findByCandidateName(String name);

		EducationDTO findByCandidateNameAndUnivercity(String name, String uc);

		boolean findBacklogByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName, String uc);

		EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
				LocalDate endDate);

		double findByPercentageBYCandidateName(String candidateName);

		String findStreamByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName, String uc);

		double findIdBycandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName, String uc);

		String findUnivercityByCandidateName(String candidateName);

		int total();

	}

}
