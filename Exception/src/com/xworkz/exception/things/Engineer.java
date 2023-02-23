package com.xworkz.exception.things;

public class Engineer extends Person {

	public Engineer(int id, String name, int age, String email) {
		super(id, name, age, email);
	}

	public Engineer(int id, String name, String email) {
		super(id, name, email);
	}

	public Engineer(int id, String name) {
		super(id, name);
	}

	@Override
	public String toString() {
		System.out.println("Over Riding ToString in Person");
		return "ID :" + this.id + "  name :" + this.name + "  Age :" + this.age + "  Email :" + this.email;
	}

	@Override
	public int hashCode() {
		System.out.println("Over Riding HashCode in Engineer...");
		return 2200;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over Riding Equals in Engineer....");
		if (obj != null) {
			System.out.println("obj is not null ..");
			if (obj instanceof Engineer) {
				System.out.println("Obj is Engineer Type..");
				Engineer casted = (Engineer) obj;
				Engineer left = this;
				Engineer right = casted;
				if (left.id == right.id && left.name == right.name && left.name.equals(name) && left.age == right.age
						&& left.email.equals(right.email)) {
					System.out.println("Left and Right are Same ");
					return true;
				} else {
					System.err.println("Left and Right are not Same");
				}
			} else {
				System.err.println("obj is not Engineer type...");
			}
		} else {
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}

}