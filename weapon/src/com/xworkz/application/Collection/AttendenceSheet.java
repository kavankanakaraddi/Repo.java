package com.xworkz.application.Collection;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AttendenceSheet {

	public static void main(String[] args) {

		Collection<String> sheet = new ArrayList<String>();
		sheet.add("Annesh");
		sheet.add("Priyanka");
		sheet.add("Basavaraj");
		sheet.add("Sanketh");
		sheet.add("Kavan");
		sheet.add("Akshata");
		sheet.add("Dinakar");
		sheet.add("Shruthi");
		sheet.add("Shivu");
		sheet.add("Darshan");
		sheet.add(null);

		// For Each loop (Read only )
		for (String col : sheet) {
			if (Objects.nonNull(col)) {
				System.out.println(col.toUpperCase());
			}
		}
		System.out.println("Total Size : " + sheet.size());

		// Iterator Method and It is Used to Read As well Modify the original collection

		Iterator<String> iterator = sheet.iterator();
		while (iterator.hasNext()) {
			String obj = iterator.next();
			if (Objects.isNull(obj)) {
				iterator.remove();
			}
		}
		System.out.println(sheet);
		System.out.println("Total Size : " + sheet.size());
	}

}
