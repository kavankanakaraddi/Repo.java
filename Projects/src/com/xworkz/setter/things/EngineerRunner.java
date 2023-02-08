package com.xworkz.setter.things;

import com.xworkz.setter.boot.Degree;
import com.xworkz.setter.boot.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer engineer = new Engineer();
		String[] skills= {"Caed","Primevera"};
		engineer.setskills(skills);
		
		Degree dg = new Degree();
		dg.setname("BE");
		dg.setduration(3);
		dg.setbranch("CIVIL");
		dg.setparsuing(true);
		dg.setpercentage(65.80d);
		Degree[] ref= {dg};
		engineer.setdegree(ref);
		engineer.show();
	}
}
