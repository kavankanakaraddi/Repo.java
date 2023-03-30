package com.xworkz.weapon.util;

import java.time.LocalDate;

public class FestivalValidUtil {
	public static boolean validId(int id) {
		if (id > 0 && id < 101) {
			return true;
		}
		return false;
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate before = LocalDate.of(2024, 12, 15);
		LocalDate after = LocalDate.of(2022, 12, 5);
		if (date != null && date.isBefore(before) && date.isAfter(after)) {
			return true;
		}
		return false;
	}
	public static boolean validFalg(boolean... flag) {
		for(int i=0;i<flag.length;i++) {
			boolean temp=flag[i];
			if(!temp) {
				return false;
			}
		}
		return true;
	}



}
