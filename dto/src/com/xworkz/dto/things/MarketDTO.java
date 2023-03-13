package com.xworkz.dto.things;

import java.io.Serializable;
import java.util.Objects;

public class MarketDTO implements Serializable {
	private String madeBy;
	private String name;

	public MarketDTO() {
		super();
		System.out.println("No Arg Const in Market");
	}

	@Override
	public String toString() {
		return "MarketDTO [madeBy=" + madeBy + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(madeBy, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return Objects.equals(madeBy, other.madeBy) && Objects.equals(name, other.name);
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
