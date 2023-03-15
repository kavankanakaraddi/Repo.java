package com.xworkz.weapon.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.weapon.constants.Type;

public class WeaponDTO implements Serializable{
	private int weaponID;
	private String name;
	private Type type;
	private double cost;
	private String material;
	private String madeBy;
	private String manufacturedBy;
	private LocalDate manufacturedYear;
	private String usedBy;
	private String usedFor;
	private double weight;
	
	public WeaponDTO() {
		System.out.println("No Arg Constr");
	}

	public WeaponDTO(int weaponID, String name, Type type, double cost, String material, String madeBy,
			String manufacturedBy, LocalDate manufacturedYear, String usedBy, String usedFor, double weight) {
		super();
		this.weaponID = weaponID;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.material = material;
		this.madeBy = madeBy;
		this.manufacturedBy = manufacturedBy;
		this.manufacturedYear = manufacturedYear;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WeaponDTO [weaponID=" + weaponID + ", name=" + name + ", type=" + type + ", cost=" + cost
				+ ", material=" + material + ", madeBy=" + madeBy + ", ManufacturedBy=" + manufacturedBy
				+ ", manufacturedYear=" + manufacturedYear + ", usedBy=" + usedBy + ", usedFor=" + usedFor + ", weight="
				+ weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturedBy, cost, madeBy, manufacturedYear, material, name, type, usedBy, usedFor,
				weaponID, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeaponDTO other = (WeaponDTO) obj;
		return Objects.equals(manufacturedBy, other.manufacturedBy)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Objects.equals(madeBy, other.madeBy) && Objects.equals(manufacturedYear, other.manufacturedYear)
				&& Objects.equals(material, other.material) && Objects.equals(name, other.name) && type == other.type
				&& Objects.equals(usedBy, other.usedBy) && Objects.equals(usedFor, other.usedFor)
				&& weaponID == other.weaponID
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public int getWeaponID() {
		return weaponID;
	}

	public void setWeaponID(int weaponID) {
		this.weaponID = weaponID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		manufacturedBy = manufacturedBy;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(LocalDate manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
