package com.xworkz.exception.things;

public class Doctor extends Person {
	public String specialisation;
	public String hospitalName;

	public Doctor() {

	}

	public Doctor(int id, String name, int age, String email, String specialisation) {
		super(id, name, age, email);
		this.specialisation = specialisation;
	}

	public Doctor(int id, String name, String email, String hospitalName) {
		super(id, name, email);
		this.hospitalName = hospitalName;
	}

	public Doctor(String hospitalName, int id, String name, String specialisation) {
		super(id, name);
		this.specialisation = specialisation;
		this.hospitalName = hospitalName;
	}

	@Override
	public int hashCode() {
		System.out.println("Over Riding HashCode in Doctor...");
		return 550;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over Riding Equals in Doctor....");
		if (obj != null) {
			System.out.println("obj is not null ..");
			if (obj instanceof Doctor) {
				System.out.println("Obj is Engineer Type..");
				Doctor casted = (Doctor) obj;
				Doctor left = this;
				Doctor right = casted;
				if (left.id == right.id && left.name == right.name && left.name.equals(name) && left.age == right.age
						&& left.email.equals(right.email) && left.specialisation.equals(right.specialisation)
						&& left.hospitalName.equals(right.hospitalName)) {
					System.out.println("Left and Right are Same ");
					return true;
				} else {
					System.err.println("Left and Right are not Same");
				}
			} else {
				System.err.println("obj is not Doctor type...");
			}
		} else {
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over Riding ToString in Person");
		return "ID :" + this.id + "name :" + this.name + "Age :" + this.age + "Email :" + this.email
				+ "Specialisation :" + this.specialisation + "HospitalName :" + this.hospitalName;
	}

}
