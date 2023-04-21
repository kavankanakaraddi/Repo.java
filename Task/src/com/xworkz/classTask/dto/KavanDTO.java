
package com.xworkz.classTask.dto;

public class KavanDTO {

	private String education;
	private int age;
	private String location;
	private double weight;
	private int pincode;

	public KavanDTO(String education, int age, String location, double weight, int pincode) {
		super();
		this.education = education;
		this.age = age;
		this.location = location;
		this.weight = weight;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "KavanDTO [education=" + education + ", age=" + age + ", location=" + location + ", weight=" + weight
				+ ", pincode=" + pincode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + pincode;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof KavanDTO)) {
			return false;
		}
		KavanDTO other = (KavanDTO) obj;
		if (age != other.age) {
			return false;
		}
		if (education == null) {
			if (other.education != null) {
				return false;
			}
		} else if (!education.equals(other.education)) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		if (pincode != other.pincode) {
			return false;
		}
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight)) {
			return false;
		}
		return true;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
