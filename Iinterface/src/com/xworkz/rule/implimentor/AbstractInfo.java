package com.xworkz.rule.implimentor;

public class AbstractInfo {
	private String createdBy = "Annesh";
	private String updatedBy = "Priyanka";

	public AbstractInfo() {

		// TODO Auto-generated constructor stub
	}

	public AbstractInfo(String createdBy, String updatedBy) {
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;

	}

	@Override
	public String toString() {
		System.out.println("toString is OverRiding");
		return "CreatedBy: " + createdBy + " " + "UpdatedBy: " + updatedBy;
	}

}
