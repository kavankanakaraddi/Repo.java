package com.xworkz.application.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExamSchedule {

	public static void main(String[] args) {

		Collection<String> exam = new ArrayList<String>();
		exam.add("Exams");
		exam.add("Timings");
		exam.add("Subjects");
		exam.add("Date");
		exam.add("Exams");
		exam.add("Exams");
		exam.add("Exams");
		exam.add("Exams");
		exam.add("Exams");
		exam.add("Exams");
		exam.add(null);

		

		// For Each loop (Read only )
		for (String col : exam) {
			if (Objects.nonNull(col)) {
				System.out.println(col.toUpperCase());
			}
		}
		System.out.println("Total Size : " + exam.size());

		// Iterator Method and It is Used to Read As well Modify the original collection

		Iterator<String> iterator = exam.iterator();
		while (iterator.hasNext()) {
			String obj = iterator.next();
			if (Objects.isNull(obj)) {
				iterator.remove();
			}
		}
		System.out.println(exam);
		System.out.println("Total Size : " + exam.size());
	}

}
