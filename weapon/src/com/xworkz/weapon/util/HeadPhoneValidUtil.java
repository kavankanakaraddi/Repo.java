package com.xworkz.weapon.util;

import java.time.LocalDate;

public class HeadPhoneValidUtil {
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

	public static boolean validDouble(double numb) {
		if (numb > 0 && numb < 10000) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate after = LocalDate.of(2021, 1, 1);
		if (date != null && date.isBefore(tomorrow) && date.isAfter(after)) {
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

}
