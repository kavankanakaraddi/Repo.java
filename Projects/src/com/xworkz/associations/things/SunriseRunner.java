package com.xworkz.associations.things;

import com.xworkz.associations.boot.Sun;
import com.xworkz.associations.boot.Sunrise;

public class SunriseRunner {

		public static void main(String[] args) {
			
			Sunrise sunrise = new Sunrise("Sun",6);
			sunrise.display();
			Sun sun = new Sun (true, 6.30d);
			sun.display();
		
			

		}
	}


