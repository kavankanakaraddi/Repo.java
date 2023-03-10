package com.xworkz.Rule2;

public class Usage2 implements ExamRule {

	@Override
	public int duration() {
		double Time = 3;
		if (Time == 3.5) {
			System.out.println("The Exam is Mathematics : "+Time);

		} else {
			System.out.println("Remaining All Subjects : "+Time);
		}
		return 0;
	}

	@Override
	public int noOfStudentsPerClass() {
		int Students = 45;
		if (Students <= 30) {
			System.out.println("The no Of Students in Class is : " );

		}else {
			System.out.println("The Class is full and The Number count is : "+Students );

		}
		return 0;
	}

}
