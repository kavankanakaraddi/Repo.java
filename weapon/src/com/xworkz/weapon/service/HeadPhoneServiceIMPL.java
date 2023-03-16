package com.xworkz.weapon.service;

import java.awt.Color;
import java.time.LocalDate;

import com.xworkz.weapon.constants.HeadPhone.Brand;
import com.xworkz.weapon.constants.HeadPhone.Colour;
import com.xworkz.weapon.constants.HeadPhone.TypeAndWeight;
import com.xworkz.weapon.dto.HeadPhoneDTO;
import com.xworkz.weapon.util.HeadPhoneValidUtil;

public class HeadPhoneServiceIMPL implements HeadPhoneService {

	@Override
	public boolean validateAndThenSave(HeadPhoneDTO dto) {
		if(dto!=null) {
			System.out.println("DTO is not null,so validate");
			 Brand brand=dto.getBrand();
			 String modelNo=dto.getModelNO();
			 double price=dto.getPrice();
			 boolean bass=dto.isBass();
			 Colour color=dto.getColour();
			 TypeAndWeight typeAndWeight=dto.getTypeandweight();
			 String customerName=dto.getCustomerName();
			 int invoiceNo=dto.getInvoiceN();
			 LocalDate mfgDate=dto.getManufacturedDate();
			 int warrantyPeriod=dto.getWarrentyPeriod();
			 
			 boolean validBrand=false;
			 boolean validModelNo=false;
			 boolean validPrice=false;
			 boolean validBass=false;
			 boolean validColor=false;
			 boolean validTypeAndWeight=false;
			 boolean validCustomerName=false;
			 boolean validInvoiceNo=false;
			 boolean validMfgDate=false;
			 boolean validWarrantyPeriod=false;
			 
			 if(brand!=null) {
				 System.out.println("Valid Brand");
				 validBrand=true;
			 }else {
				 System.err.println("Invalid Brand");
			 }
			 if(HeadPhoneValidUtil.validString(modelNo)) {
				 System.out.println("Valid ModelNo");
				 validModelNo=true;
			 }else {
				 System.err.println("Invalid ModelNo");
			 }
			 if(HeadPhoneValidUtil.validDouble(price)) {
				 System.out.println("Valid Price");
				 validPrice=true;
			 }else {
				 System.err.println("Invalid Price");
			 }
			 if(bass!=false) {
				 System.out.println("Valid Bass");
				 validBass=true;
			 }else {
				 System.err.println("Invalid Bass");
			 }
			 if(color!=null) {
				 System.out.println("Valid color");
				 validColor=true;
			 }else {
				 System.err.println("Invalid Color");
			 }
			 if(typeAndWeight!=null) {
				 System.out.println("Valid typeAndWeight");
				 validTypeAndWeight=true;
			 }else {
				 System.err.println("Invalid typeAndWeight");
			 }
			 if(HeadPhoneValidUtil.validString(customerName)) {
				 System.out.println("Valid customerName");
				 validCustomerName=true;
			 }else {
				 System.err.println("Invalid customerName");
			 }
			 if(HeadPhoneValidUtil.validInt(invoiceNo)) {
				 System.out.println("Valid invoiceNo");
				 validInvoiceNo=true;
			 }else {
				 System.err.println("Invalid invoiceNo");
			 }
			
			 if(HeadPhoneValidUtil.validDate(mfgDate)) {
				 System.out.println("Valid mfgDate");
				 validMfgDate=true;
			 }else {
				 System.err.println("Invalid mfgDate");
			 }
			 if(HeadPhoneValidUtil.validInt(warrantyPeriod)) {
				 System.out.println("Valid warrantyPeriod");
				 validWarrantyPeriod=true;
			 }else {
				 System.err.println("Invalid warrantyPeriod");
			 }
			 if(HeadPhoneValidUtil.validFlag(validBrand,validModelNo,validPrice,validBass,validColor,validTypeAndWeight,validCustomerName,validInvoiceNo,validMfgDate,validWarrantyPeriod)) {
				 System.out.println("Validation is done,saved");
				 return true;
			 }else {
				 System.err.println("Validation is not done,not saved");
				 return false;
			 }
		}else {
			System.err.println("DTO is null,so dont validate");
		}
		return false;
	}
	




}
