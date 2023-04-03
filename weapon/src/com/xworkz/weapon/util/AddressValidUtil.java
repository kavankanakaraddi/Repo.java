package com.xworkz.weapon.util;

public class AddressValidUtil {
	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int num) {
		if (num > 0 && num < 10000000) {
			return true;
		}
		return false;

	}

	public static boolean validFlag(boolean... flag) {
		for (int i = 0; i < flag.length; i++) {
			boolean temp = flag[i];
			if (temp) {
				return true;
			}
		}
		return false;

	}

	public static boolean validFalg(boolean validCity, boolean validfloor, boolean validNumber, boolean validPincode,
			boolean validState, boolean validStreet, boolean validState2) {
		return false;
	}

}
