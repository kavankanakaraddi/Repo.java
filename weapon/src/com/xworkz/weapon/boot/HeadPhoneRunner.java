package com.xworkz.weapon.boot;

import java.awt.Color;
import java.time.LocalDate;

import com.xworkz.weapon.constants.HeadPhone.Brand;
import com.xworkz.weapon.constants.HeadPhone.Colour;
import com.xworkz.weapon.constants.HeadPhone.TypeAndWeight;
import com.xworkz.weapon.dto.HeadPhoneDTO;
import com.xworkz.weapon.service.HeadPhoneServiceIMPL;

public class HeadPhoneRunner {

	public static void main(String[] args) {
			HeadPhoneDTO headphoneDTO = new HeadPhoneDTO(Brand.BOULT,"B16111", 2500,true,Colour.PINK,TypeAndWeight.WIRED,"Annesh", 1532456,LocalDate.now(), 1);
			System.out.println(headphoneDTO.toString());
			System.out.println(headphoneDTO.hashCode());
			System.out.println(headphoneDTO.equals(headphoneDTO));

			HeadPhoneServiceIMPL headphoneService = new HeadPhoneServiceIMPL();
			headphoneService.validateAndThenSave(headphoneDTO);

		}

	}


