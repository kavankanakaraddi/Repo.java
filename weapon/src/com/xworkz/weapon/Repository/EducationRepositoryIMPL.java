package com.xworkz.weapon.Repository;

import java.time.LocalDate;


import com.xworkz.weapon.Repository.EducationRepository.EducationRepo;
import com.xworkz.weapon.dto.EducationDTO;

public class EducationRepositoryIMPL implements EducationRepo {

	private EducationDTO[] educat = new EducationDTO[3];
	private int educatindex = 0;

	@Override
	public boolean save(EducationDTO repo) {
		System.out.println("running save a education dto in repoo:" + repo);
		if (this.educatindex < this.educat.length) {
			this.educat[educatindex] = repo;
			System.out.println("repo is saved at index:" + this.educatindex + " " + repo);
			this.educatindex++;
			return true;
		} else {
			System.err.println("memeory is full canot add more than 3 files");
		}

		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {
		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO element = this.educat[index];
			if (element.equals(dto)) {
				System.out.println("dto is find");
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO element = this.educat[index];
			if (element.getCandidateName().equals(name)) {
				System.out.println("name is present:" + name);
			}
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUnivercity(String name, String uc) {
		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO element = this.educat[index];
			if (element.getCandidateName().equals(name) && element.getUnivercity().equals(uc)) {
				System.out.println("candidate name is present:" + name + " " + "univercity is present:" + uc);
			}
		}
		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String uc) {
		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO temp = this.educat[index];
			if (temp.getCandidateName().equals(candidateName) && temp.getDegreeName().equals(degreeName)
					&& temp.getUnivercity().equals(uc)) {
				System.out.println("candidate name is present:" + candidateName + " " + "digree name is present:"
						+ degreeName + " " + "univercity is present:" + uc);
			}
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO temp = this.educat[index];
			if (temp.getCandidateName().equals(candidateName) && temp.getStartDate().equals(startDate)
					&& temp.getEndDate().equals(endDate)) {
				System.out.println(
						"candidatenameAndStartDateAndEndDate:" + candidateName + " " + startDate + " " + endDate);
			}
		}
		return null;
	}

	@Override
	public double findByPercentageBYCandidateName(String candidateName) {
		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO temp = this.educat[index];
			if (temp.getCandidateName().equals(candidateName)) {
				System.out.println("candidatename:" + candidateName);
			}
		}
		return educatindex;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String uc) {

		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO temp = this.educat[index];
			if (temp.getCandidateName().equals(candidateName) && temp.getDegreeName().equals(degreeName)
					&& temp.getUnivercity().equals(uc)) {
				System.out.println("candidate name is present:" + candidateName + " " + "univercity is present:" + uc
						+ " " + "degree name is present :" + degreeName);
			}
		}
		return null;
	}

	@Override
	public double findIdBycandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName, String uc) {

		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO temp = this.educat[index];
			if (temp.getCandidateName().equals(candidateName) && temp.getDegreeName().equals(degreeName)
					&& temp.getUnivercity().equals(uc)) {
				System.out
						.println("candidatenameAndStartDateAndEndDate:" + candidateName + " " + degreeName + " " + uc);
			}
		}
		return 0;
	}

	@Override
	public String findUnivercityByCandidateName(String candidateName) {
		for (int index = 0; index < this.educat.length; index++) {
			EducationDTO temp = this.educat[index];
			if (temp.getCandidateName().equals(candidateName)) {
				System.out.println("candidatename:" + candidateName);
			}
		}
		return null;
	}

	@Override
	public int total() {

		return 0;
	}

	public boolean isExist(EducationDTO dto) {
		if (this.educatindex == 0) {
			System.out.println("first element will not chack");
			return false;
		} else {
			System.out.println("second element onward chack");
			for (int index = 0; index < this.educatindex; index++) {
				EducationDTO temp = this.educat[index];
				if (temp.equals(dto)) {
					System.out.println("fine its alredy exests ");
					return true;
				}
			}
		}
		return false;

	}

}


