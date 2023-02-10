package com.xworkz.tasks.boot;

public class Security {
	public String departmentName;
	public int totalStaff;
	public String headSttaff;
	public Company company;
	
	public void setsecurity (String departmentName,int totalStaff,String headSttaff) {
		this.departmentName=departmentName;
		this.headSttaff=headSttaff;
		this.totalStaff=totalStaff;
	}
	public void setCompany (Company company ) {
		this.company=company;
	}
	public void display() {
		System.out.println("Details of Security");
		System.out.println("departmentName::"+this.departmentName);
		System.out.println("totalStaff:: "+this.totalStaff);
		System.out.println("headSttaff::"+this.headSttaff);
		if (this.company!=null) {
			this.company.display();
		}else {
			System.err.println("this.company is null ......");
		}

	}

}
