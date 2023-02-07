package com.xworkz.associations.things;

import com.xworkz.associations.boot.Sweater;
import com.xworkz.associations.boot.Zip;

public class SweaterRunner {
		public static void main(String[] args) {
			
			Sweater sweater = new Sweater("WildCraft", 5);
			sweater.display();
			Zip zip = new Zip (false, "Nike");
			zip.display();
		
			

		}
	}


