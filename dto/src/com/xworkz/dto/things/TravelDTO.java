package com.xworkz.dto.things;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TravelDTO implements Serializable {
	private String name;
	private LocalDate startedOn;
	private int amount;
	
	

	public TravelDTO() {
		super();
		System.out.println("No Arg Const in Travels");
	}
	

	@Override
	public String toString() {
		return "TravelDTO [name=" + name + ", startedOn=" + startedOn + ", amount=" + amount + "]";
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(amount, name, startedOn);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return amount == other.amount && Objects.equals(name, other.name) && Objects.equals(startedOn, other.startedOn);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartedOn() {
		return startedOn;
	}

	public void setStartedOn(LocalDate startedOn) {
		this.startedOn = startedOn;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
