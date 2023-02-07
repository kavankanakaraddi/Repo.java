package com.xworkz.associations.things;

import com.xworkz.associations.boot.Gift;
import com.xworkz.associations.boot.Box;

public class GiftboxRunner {

	
		public static void main(String[] args) {
			
			Gift gift = new Gift("Pens", 30);
			gift.display();
			Box box = new Box (false, 5.5d
					);
			box.display();
		
			

		}
	}


