package com.xworkz.setter.boot;

public class Engineer {
	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degree;

	public void setname(String name) {
		this.name = name;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public void setskills(String[] skills) {
		this.skills = skills;
	}

	public void setdegree(Degree[] degree) {
		this.degree = degree;
	}

	public void show() {
		System.out.println("Details of Engineeer");
		System.out.println("name" + name);
		System.out.println("salary" + salary);
		System.out.println("Degree" + degree);
		if (this.skills != null) {
			for (int seq = 0; seq < this.skills.length; seq++) {
				String ref = this.skills[seq];
				System.out.println("Skills::" + ref);
			}
		} else {
			System.err.println("Engineer is not pointed to any address");
		}
		if (this.degree != null) {
			for (int num = 0; num < this.degree.length; num++) {
				Degree ref = this.degree[num];
			}
		}

	}
}
