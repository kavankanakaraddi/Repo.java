package com.xworkz.weapon.dto;

import java.time.LocalDate;

import com.xworkz.weapon.constants.HeadPhone.Brand;
import com.xworkz.weapon.constants.HeadPhone.Colour;
import com.xworkz.weapon.constants.HeadPhone.TypeAndWeight;

public class HeadPhoneDTO {
	private Brand brand;
	private String modelNO;
	private double price;
	private boolean bass;
	private Colour colour;
	private TypeAndWeight typeandweight;
	private String customerName;
	private int invoiceN;
	private LocalDate manufacturedDate;
	private int warrentyPeriod;

	public HeadPhoneDTO(Brand brand, String modelNO, double price, boolean bass, Colour colour,
			TypeAndWeight typeandweight, String customerName, int invoiceN, LocalDate manufacturedDate,
			int warrentyPeriod) {
		super();
		this.brand = brand;
		this.modelNO = modelNO;
		this.price = price;
		this.bass = bass;
		this.colour = colour;
		this.typeandweight = typeandweight;
		this.customerName = customerName;
		this.invoiceN = invoiceN;
		this.manufacturedDate = manufacturedDate;
		this.warrentyPeriod = warrentyPeriod;

	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [brand=" + brand + ", modelNO=" + modelNO + ", price=" + price + ", bass=" + bass
				+ ", colour=" + colour + ", typeandweight=" + typeandweight + ", customerName=" + customerName
				+ ", invoiceN=" + invoiceN + ", manufacturedDate=" + manufacturedDate + ", warrentyPeriod="
				+ warrentyPeriod + "]";
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNO() {
		return modelNO;
	}

	public void setModelNO(String modelNO) {
		this.modelNO = modelNO;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public TypeAndWeight getTypeandweight() {
		return typeandweight;
	}

	public void setTypeandweight(TypeAndWeight typeandweight) {
		this.typeandweight = typeandweight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceN() {
		return invoiceN;
	}

	public void setInvoiceN(int invoiceN) {
		this.invoiceN = invoiceN;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public int getWarrentyPeriod() {
		return warrentyPeriod;
	}

	public void setWarrentyPeriod(int warrentyPeriod) {
		this.warrentyPeriod = warrentyPeriod;
	}
	

}
