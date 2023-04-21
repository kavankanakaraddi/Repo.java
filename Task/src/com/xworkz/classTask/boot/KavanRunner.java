package com.xworkz.classTask.boot;



import com.xworkz.classTask.Service.KavanService;
import com.xworkz.classTask.Service.KavanServiceIMPL;
import com.xworkz.classTask.dto.KavanDTO;
import com.xworkz.classTask.repository.KavanRepository;
import com.xworkz.classTask.repository.KavanRepositoryIMPL;

public class KavanRunner {

	public static void main(String[] args) {
		
		
		
	
		KavanDTO dto = new KavanDTO("BE CIVIL ", 25, "Bengaluru", 65.5, 587313);
		KavanRepository repository = new KavanRepositoryIMPL();
		KavanService service  = new KavanServiceIMPL(repository);
		
		boolean save = service.validateAndThenSave(dto);
		System.out.println(save);
		
		
				
		
	





		
	}

}
