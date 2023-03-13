package com.xworkz.dto.things;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ApplicationDTO implements Serializable {
	private String name;
	private String developedBy;
	private LocalDate createdOn;
	private double size;
	private double version;

	public ApplicationDTO() {
		super();
		System.out.println("no Arg Constr in Application");
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", developedBy=" + developedBy + ", createdOn=" + createdOn + ", size="
				+ size + ", version=" + version + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, developedBy, name, size, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationDTO other = (ApplicationDTO) obj;
		return Objects.equals(createdOn, other.createdOn) && Objects.equals(developedBy, other.developedBy)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(size) == Double.doubleToLongBits(other.size)
				&& Double.doubleToLongBits(version) == Double.doubleToLongBits(other.version);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

}
