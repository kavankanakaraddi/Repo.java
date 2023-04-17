package com.xworkz.application.Collection.validator;

public class Runner {

	public static void main(String[] args) {

		//////////////////////////////// Explicit Reference //////////////////////////////
		Hunter hunter = (total) -> {
			System.out.println("Total :" + total);
		};
		Util.test(hunter);

		//////////////////////////////// Implicit Reference /////////////////////////////////

		Util.test((arg) -> {
			System.out.println("Running Fun in  : " + arg);
		});

		////////////// IMPLICIT REFERENCE OF PLAYER CLASS ///////////////////////////

		Util.test((name, state) -> {
			//System.out.println("Running Fun At : " + name.toUpperCase() + " : " + state.toUpperCase());
			return name.toUpperCase();
		});

		Util.test((name, state) -> {
			//System.out.println("Running Fun At : " + name.toLowerCase() + " : " + state.toLowerCase());
			return name.toLowerCase();
		});

		Util.test((name, state) -> {
			//System.out.println("Running Fun At : " + name + " : " + state);
			return name +" "+ state;
		});

		//////////////////////////// GAMBLER //////////////////////////////////////////

		Util.test1((kirik) -> {
			if (kirik < 500 && kirik < 1000) {
				System.out.println("Principal  is less than 500 and 1000  : " + kirik);
				return 0;
			} else if (kirik > 1000) {

				System.out.println("Principal  is Greater than  1000  : " + kirik);
				return 100;

			}
			return kirik;
		});

		/////////////////////////////// --- RUNNER ---//////////////////////////

		Util.test2((Runns) -> {
			System.out.println("The Distance Travelled  :: " + Runns);
			return 0.0D;
		});

		//////////////////////////// ---- EATER ---///////////////////////////////

		Util.test3((quan, quann) -> {
			System.out.println("The Food  is  :: " + quan + "  Quantity is :: " + quann);
			return quan + quann;
		});

		Util.test3((quan, quann) -> {
			System.out.println("The Food  is  :: " + quan.toUpperCase() + "  Quantity is :: " + quann);
			return quan + quann;
		});
		Util.test3((quan, quann) -> {
			System.out.println("The Food  is  :: " + quan.toLowerCase() + "  Quantity is :: " + quann);
			return quan + quann;
		});
		////////////////////////////////////////////////////////////////////////////////////////

	}
}
