package com.xworkz.weapon.util;

import java.time.LocalDate;

public class EducationUtil {
	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		} else {

		}
		return false;
	}

	public static boolean validint(int number) {
		if (number > 0 && number < 500) {
			return true;
		} else {

		}
		return false;
	}

	public static boolean validdouble(double numbers) {
		if (numbers > 0 && numbers < 500) {
			return true;
		} else {

		}
		return false;
	}

	public static boolean validdate(LocalDate date, LocalDate past) {
		LocalDate today = LocalDate.of(2023, 4, 2); // 0r LocalDate tommrow=LocalDate.of(now).plusedays1
		LocalDate pastdate = LocalDate.of(2015, 10, 30);
		if (date != null && date.isAfter(pastdate) && date.isBefore(today)) {
			return true;
		} else {

		}
		return false;
	}

	public static boolean validFlag(boolean... flag) {

		for (int index = 0; index < flag.length; index++) {
			boolean temp = flag[index];
			if (!temp) {
				return false;
			}
		}
		return true;

	}

}
