package com.xworkz.weapon.dto;

public class SoftwareDTO {

	private int id;
	private String name;
	private String developedBy;

	public SoftwareDTO(int id, String name, String developedBy) {
		super();
		this.id = id;
		this.name = name;
		this.developedBy = developedBy;
	}

	@Override
	public String toString() {
		return "SoftwareDTO [id=" + id + ", name=" + name + ", developedBy=" + developedBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developedBy == null) ? 0 : developedBy.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareDTO other = (SoftwareDTO) obj;
		if (developedBy == null) {
			if (other.developedBy != null)
				return false;
		} else if (!developedBy.equals(other.developedBy))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
	

}
