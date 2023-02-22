package com.xowrkz.objects.things;

public class Park {
	private String name;
	private String location;
	private int opensAt;
	private int closesAt;
	private double entryFees;
	private boolean saftey;
	
	public Park () {
		System.out.println("No Arg Constr in Park");
	}

	public Park(String name, String location, int opensAt, int closesAt, double entryFees, boolean saftey) {
		this.name = name;
		this.location = location;
		this.opensAt = opensAt;
		this.closesAt = closesAt;
		this.entryFees = entryFees;
		this.saftey = saftey;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals in Park" + obj);
		if (obj != null) {
			System.out.println("obj Is not  Null ");
			if (obj instanceof Park) {
				System.out.println("obj is Park");
				Park casted = (Park) obj;
				Park left = this;
				Park right = casted;
				if (left.name.equals(right.name) && left.entryFees == right.entryFees && left.opensAt == right.opensAt && left.closesAt == right.closesAt &&( left.saftey == right.saftey ) &&( left.location.equals(right.location ))) {
					System.out.println("Left is Equal to Right ");
				} else {
					System.out.println("Left is Not Equal to Right ");
				}

			} else {
				System.out.println("Object is not Park");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return true;
	}
	@Override
	public String toString() {
		return "[Name : " + this.name + "][ Location  : " + this.location + "][ Opens At : " + this.opensAt+"]  [ Closes At :"+this.closesAt+"Saftey : "+this.saftey +"]";
	}
	

}
