package com.xworkz.weapon.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


public class FestivalDTO {
	private int id;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String sweet;
	private String godName;

	public FestivalDTO(int id, String name, LocalDate startDate, LocalDate endDate, String sweet, String godName) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sweet = sweet;
		this.godName = godName;
	}

	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", sweet=" + sweet + ", godName=" + godName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(endDate, godName, id, name, startDate, sweet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof FestivalDTO)) {
			return false;
		}
		FestivalDTO other = (FestivalDTO) obj;
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (godName == null) {
			if (other.godName != null) {
				return false;
			}
		} else if (!godName.equals(other.godName)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (sweet == null) {
			if (other.sweet != null) {
				return false;
			}
		} else if (!sweet.equals(other.sweet)) {
			return false;
		}
		return true;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getSweet() {
		return sweet;
	}

	public String getGodName() {
		return godName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}


}
