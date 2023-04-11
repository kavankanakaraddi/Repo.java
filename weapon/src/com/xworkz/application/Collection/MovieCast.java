package com.xworkz.application.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MovieCast {

	public static void main(String[] args) {

		Collection<String> cast = new ArrayList<String>();
		cast.add("Actor");
		cast.add("Actress");
		cast.add("Comedian");
		cast.add("Singer");
		cast.add("Villain");
		cast.add("Side-Actor");
		cast.add("ParentRole");
		cast.add("Guardian");
		cast.add("Film");
		cast.add("Scriptt");

		// For Each loop (Read only )
		for (String col : cast) {
			if (Objects.nonNull(col)) {
				System.out.println(col.toUpperCase());
			}
		}
		System.out.println("Total Size : " + cast.size());

		// Iterator Method and It is Used to Read As well Modify the original collection

		Iterator<String> iterator = cast.iterator();
		while (iterator.hasNext()) {
			String obj = iterator.next();
			if (Objects.isNull(obj)) {
				iterator.remove();
			}
		}
		System.out.println(cast);
		System.out.println("Total Size : " + cast.size());
	}

}
