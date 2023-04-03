package com.xworkz.weapon.boot;

import java.time.LocalDate;

import com.xworkz.weapon.Repository.EducationRepository.EducationRepo;
import com.xworkz.weapon.Repository.EducationRepositoryIMPL;
import com.xworkz.weapon.dto.EducationDTO;
import com.xworkz.weapon.service.EducationService;
import com.xworkz.weapon.service.EducationServiceIMPL;

public class EducationRunner {
	EducationDTO dto = new EducationDTO("A2id", "engineering", 65, "VTUbelagavi", LocalDate.of(2016, 1, 26),
			LocalDate.of(2020, 5, 5), 1, "branch", "basu");
	EducationRepo ref = new EducationRepositoryIMPL();
	EducationService service = new EducationServiceIMPL(ref);
	boolean save = service.validthanSave(dto);
	System.out.println(save);
	System.out.println("----------------------------------------");

	EducationDTO dto1 = new EducationDTO("b2id", "becom", 32, "dharwadUc", LocalDate.of(2016, 1, 26),
			LocalDate.of(2020, 5, 5), 1, "branch", "raju");
	EducationService service1 = new EducationServiceIMPL(ref);
	boolean save1 = service1.validthanSave(dto1);
	System.out.println(save1);

	System.out.println("----------------------------------------------");

	EducationDTO dto2 = new EducationDTO("c2id", "bcacs", 70, "ranijanamUc", LocalDate.of(2016, 5, 26),
			LocalDate.of(2020, 5, 5), 1, "branch", "pavan");
	EducationService service2 = new EducationServiceIMPL(ref);
	boolean save2 = service2.validthanSave(dto2);
	System.out.println(save2);
	service2.findByPercentageBYCandidateName("basu");
	service2.findBacklogByCandidateNameAndDegreeNameAndUnivercity("rocks", "metch", "kuvempu");
	service2.findIdBycandidateNameAndDegreeNameAndUnivercity("pavan", "bcacs", "ranijanam");
	service1.findBacklogByCandidateNameAndDegreeNameAndUnivercity("raju", "becom", "dharwad");
	service1.findByCandidateName("raju");

	System.out.println("-----------------------------------------------------");

	EducationDTO dto3 = new EducationDTO("dkid", "metch", 80, "kuvempuUc", LocalDate.of(2016, 1, 26),
			LocalDate.of(2020, 5, 5), 1, "branch", "rocks");
	EducationService service3 = new EducationServiceIMPL(ref);
	boolean save3 = service3.validthanSave(dto3);
	System.out.println(save3);
	System.out.println("------------------------------");
	service3.find(dto3);
	service3.findBacklogByCandidateNameAndDegreeNameAndUnivercity("raju", "becom", "dharwadUc");
	service3.findStreamByCandidateNameAndDegreeNameAndUnivercity("basu", "engineering", "VTUbelagavi");

}


