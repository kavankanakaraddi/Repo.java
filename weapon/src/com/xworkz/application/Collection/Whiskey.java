package com.xworkz.application.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Whiskey {

	public static void main(String[] args) {
		Collection<String> whiskey = new ArrayList<String>();
		whiskey.add("Jim Beam");
		whiskey.add("Black & White");
		whiskey.add("McDowells");
		whiskey.add("Imperial Black");
		whiskey.add("Directors Special Black ");
		whiskey.add("Teachers");
		whiskey.add("100 pipers");
		whiskey.add("Black Dog");
		whiskey.add("Sura vana");
		whiskey.add("Bengaluru");

		// For Each loop (Read only )
		for (String col : whiskey) {
			if (Objects.nonNull(col)) {
				System.out.println(col.toUpperCase());
			}
		}
		System.out.println("Total Size : " + whiskey.size());

		// Iterator Method and It is Used to Read As well Modify the original collection

		Iterator<String> iterator = whiskey.iterator();
		while (iterator.hasNext()) {
			String obj = iterator.next();
			if (Objects.isNull(obj)) {
				iterator.remove();
			}
		}
		System.out.println(whiskey);
		System.out.println("Total Size : " + whiskey.size());
	}

}
