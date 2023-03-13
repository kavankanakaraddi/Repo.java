package com.xworkz.dto.things;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AttendenceDTO implements Serializable {
	private String maintainedAt;
	private String maintainedBy;
	private LocalDate maintainedFrom;

	public AttendenceDTO() {
		super();
		System.out.println("No Arg Const in Attendence");
	}

	@Override
	public String toString() {
		return "AttendenceDTO [maintainedAt=" + maintainedAt + ", maintainedBy=" + maintainedBy + ", maintainedFrom="
				+ maintainedFrom + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maintainedAt, maintainedBy, maintainedFrom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendenceDTO other = (AttendenceDTO) obj;
		return Objects.equals(maintainedAt, other.maintainedAt) && Objects.equals(maintainedBy, other.maintainedBy)
				&& Objects.equals(maintainedFrom, other.maintainedFrom);
	}

	public String getMaintainedAt() {
		return maintainedAt;
	}

	public void setMaintainedAt(String maintainedAt) {
		this.maintainedAt = maintainedAt;
	}

	public String getMaintainedBy() {
		return maintainedBy;
	}

	public void setMaintainedBy(String maintainedBy) {
		this.maintainedBy = maintainedBy;
	}

	public LocalDate getMaintainedFrom() {
		return maintainedFrom;
	}

	public void setMaintainedFrom(LocalDate maintainedFrom) {
		this.maintainedFrom = maintainedFrom;
	}

}
