package com.xworkz.weapon.service;

import java.time.LocalDate;

import com.xworkz.weapon.Repository.EducationRepository.EducationRepo;
import com.xworkz.weapon.dto.EducationDTO;
import com.xworkz.weapon.util.EducationUtil;


public class EducationServiceIMPL implements EducationService {

	private EducationRepo repo;

	public EducationServiceIMPL(EducationRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validthanSave(EducationDTO dto) {

		if (dto != null) {
			System.out.println("dto is not null than save andvalid all the propertes");

			int back = dto.getBacklog();
			String candidate = dto.getCandidateName();
			String degree = dto.getDegreeName();
			String id = dto.getId();
			double percentge = dto.getPercentage();
			LocalDate sdate = dto.getStartDate();
			LocalDate enddate = dto.getEndDate();
			String stream = dto.getStream();
			String univercity = dto.getUnivercity();

			boolean validBack = false;
			boolean validCandidate = false;
			boolean validDegree = false;
			boolean validSdate = false;
			boolean validEnddate = false;
			boolean validId = false;
			boolean validPercentge = false;
			boolean validStream = false;
			boolean validUnivercity = false;

			if (validint(back)) {
				System.out.println("valid backlog");
				validBack = true;
			} else {
				System.out.println("in valid backlog");
			}
			if (validString(candidate)) {
				System.out.println("valid candidate name");
				validCandidate = true;
			} else {
				System.out.println("in valid candidate name");
			}
			if (validString(degree)) {
				System.out.println("valid degreename");
				validDegree = true;
			} else {
				System.out.println("not valid degree");
			}
			if (validString(id)) {
				System.out.println("valid id");
				validId = true;
			} else {
				System.err.println("not valid id");
			}
			if (validdouble(percentge)) {
				System.out.println("valid percentege");
				validPercentge = true;
			} else {
				System.err.println("not valid percentege");
			}
			if (validdate(sdate, enddate)) {
				System.out.println("sdate is valid");
				validSdate = true;
			} else {
				System.err.println("sdate  is not valid");
			}
			if (validdate(sdate, enddate)) {
				System.out.println("end is valid");
				validEnddate = true;
			} else {
				System.err.println("end is not valid");
			}
			if (validString(stream)) {
				System.out.println("Stream is valid");
				validStream = true;
			} else {
				System.err.println("stream is not valid");
			}
			if (EducationUtil.validString(univercity)) {
				System.out.println("univercity is valid");
				validUnivercity = true;
			} else {
				System.err.println("univercity is not valid");
			}
			if (validFlag(validBack, validCandidate, validDegree, validSdate, validEnddate, validId, validPercentge,
					validStream, validUnivercity)) {

				System.out.println("comple save all the data ");
				boolean exists = this.repo.isExist(dto);
				if (!exists) {
					boolean save = this.repo.save(dto);
					return save;
				} else {
					System.out.println("dto exists");
				}
				return true;
			} else {
				System.out.println("not valid all data");
			}
		} else {
			System.err.println("dto is null and not save all the properety");
		}
		return false;
	}

	private boolean validFlag(boolean validBack, boolean validCandidate, boolean validDegree, boolean validSdate,
			boolean validEnddate, boolean validId, boolean validPercentge, boolean validStream,
			boolean validUnivercity) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean validdate(LocalDate sdate, LocalDate enddate) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean validdouble(double percentge) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean validString(String candidate) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean validint(int back) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExist(EducationDTO dto) {
		if (validthanSave(dto)) {
			return this.repo.isExist(dto);
		}

		return false;
	}

	@Override
	public EducationDTO find(EducationDTO dto) {
		if (validthanSave(dto)) {
			return this.repo.find(dto);
		}
		return null;
	}

	@Override
	public EducationDTO findByCandidateName(String name) {
		if (validString(name)) {
			return this.repo.findByCandidateName(name);
		}

		return null;
	}

	@Override
	public EducationDTO findByCandidateNameAndUnivercity(String name, String uc) {
		if (validString(name) && validString(uc)) {
			return this.repo.findByCandidateNameAndUnivercity(name, uc);
		}
		return null;
	}

	@Override
	public boolean findBacklogByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String uc) {
		if (validString(candidateName) && validString(degreeName) && validString(uc)) {
			return this.repo.findBacklogByCandidateNameAndDegreeNameAndUnivercity(candidateName, degreeName, uc);
		}
		return false;
	}

	@Override
	public EducationDTO findByCandidateNameAndStartDateAndEndDate(String candidateName, LocalDate startDate,
			LocalDate endDate) {
		if (validString(candidateName) && validdate(startDate, endDate)) {
			return this.repo.findByCandidateNameAndStartDateAndEndDate(candidateName, startDate, endDate);
		}

		return null;
	}

	@Override
	public double findByPercentageBYCandidateName(String candidateName) {
		if (validString(candidateName)) {
			return this.repo.findByPercentageBYCandidateName(candidateName);
		}
		return 0;
	}

	@Override
	public String findStreamByCandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName,
			String uc) {
		if (validString(candidateName) && validString(degreeName) && validString(uc)) {
			return this.repo.findStreamByCandidateNameAndDegreeNameAndUnivercity(candidateName, degreeName, uc);
		}
		return null;
	}

	@Override
	public double findIdBycandidateNameAndDegreeNameAndUnivercity(String candidateName, String degreeName, String uc) {
		if (validString(candidateName) && validString(degreeName) && validString(uc)) {
			return this.repo.findIdBycandidateNameAndDegreeNameAndUnivercity(candidateName, degreeName, uc);
		}
		return 0;
	}

	@Override
	public String findUnivercityByCandidateName(String candidateName) {
		if (validString(candidateName)) {
			return this.repo.findUnivercityByCandidateName(candidateName);
		}
		return null;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

}
