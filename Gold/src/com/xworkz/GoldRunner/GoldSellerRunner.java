package com.xworkz.GoldRunner;

import com.xworkz.GoldSeller.Malbar;
import com.xworkz.GoldSeller.DevendraSetu;
import com.xworkz.GoldSeller.Mahalakshmi;
import com.xworkz.GoldSeller.Abharan;
import com.xworkz.GoldRule.GoldSeller;
import com.xworkz.Usage.Anitha;
import com.xworkz.Usage.Bhairavi;
import com.xworkz.Usage.Priyanka;
import com.xworkz.Usage.Shruthi;

public class GoldSellerRunner {

	
		public static void main(String[] args) {

			GoldSeller seller = new Malbar();

			Bhairavi bhairavi = new Bhairavi(seller);
			bhairavi.bangaraKaridi();

			System.out.println("--------------------------");

			GoldSeller seller1 = new DevendraSetu();

			Shruthi shruti = new Shruthi(seller1);
			shruti.chinnaTago();

			System.out.println("-----------------------------");

			GoldSeller seller2 = new Abharan();

			Priyanka priyanka = new Priyanka(seller2);
			priyanka.purchaseGold();

			System.out.println("--------------------------------");

			GoldSeller seller3 = new Mahalakshmi();

			Anitha anitha = new Anitha(seller3);
			anitha.buyGold();

		}

	}


