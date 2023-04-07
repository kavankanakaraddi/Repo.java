package com.xworkz.application.boot;

import com.xworkz.application.Repository.VegetablesRepository;
import com.xworkz.application.Repository.VegetablesRepositoryIMPL;
import com.xworkz.application.Service.VegetablesService;
import com.xworkz.application.Service.VegetablesServiceIMPL;
import com.xworkz.application.dto.VegetablesDTO;

public class VegetablesRunner {

	public static void main(String[] args) {
		VegetablesDTO vegetablesDTO1 = new VegetablesDTO("Carrot", 1, 025, "RajajiNagar", "Bengaluru");

		VegetablesRepository repository = new VegetablesRepositoryIMPL();
		VegetablesService service = new VegetablesServiceIMPL(repository);

		VegetablesDTO vegetablesDTO2 = new VegetablesDTO("Brinjol", 2, 50, "Bengaluru", "SouthKarnataka");

		boolean save1 = service.validateAndThenSave(vegetablesDTO1);
		System.out.println("Saved:" + save1);
		System.out.println("***************************");

		boolean save2 = service.validateAndThenSave(vegetablesDTO2);
		System.out.println("Saved : " + save2);
		System.out.println("***************************");
		VegetablesDTO vegetablesDTO3 = new VegetablesDTO("Brinjol", 2, 50, "Bengaluru", "SouthKarnataka");


		boolean save3 = service.validateAndThenSave(vegetablesDTO3);
		System.out.println("Saved : " + save3);


		//System.out.println(service.findAll());
		service.findAll();

	}

}
