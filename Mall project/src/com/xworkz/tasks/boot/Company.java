package com.xworkz.tasks.boot;

public class Company {
	public String name;
	public String ceoName;
	public int since;
	public Address address;
	
	public void setname(String name) {
		this.name=name;
	}
	public void setceoname(String ceoName) {
		this.ceoName=ceoName;
	}
	public void setsince(int since) {
		this.since=since;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	public void display() {
		System.out.println("Details of Company");
		System.out.println("Name"+this.name);
		System.out.println("CEO Name"+this.ceoName);
		System.out.println("Since"+this.since);
		if (this.address!=null) {
			this.address.display();
		}else {
			System.err.println("this.address is null ......");
		}

	}
	
	
	
	
}