package com.xworkz.weapon.service;

import com.xworkz.weapon.Exception.InvalidAddrressException;
import com.xworkz.weapon.dto.AddressDTO;

public interface AddressService {
	boolean validateAndThenSave (AddressDTO dto) throws InvalidAddrressException ;

	default int count() {
		return 0;
	}
	default AddressDTO findByNumber (int number ) throws InvalidAddrressException{
		return null;
	}
	default boolean  find (AddressDTO dto ) throws InvalidAddrressException{
		return false;
	}
	default AddressDTO findByStreet (String  street ) throws InvalidAddrressException{
		return null;
	}
	default AddressDTO findByPincode (int Pincode ) throws InvalidAddrressException{
		return null;
	}
	default AddressDTO findByStreetAndPincodeAndArea(String street, int pincode,String area) throws InvalidAddrressException {
		return null;
	}
	default AddressDTO findByCityAndState (String stree,String state) throws InvalidAddrressException {
		return null;
	}
	default AddressDTO findFloorByNumber (int number) throws InvalidAddrressException {
		return null;
	}
	default String findCityNumberAndFloorAndStreetAndPincode(int number,int floor, String street, int pincode) throws InvalidAddrressException	{
		return null;
	}
	default int findPincodeByNumber (int number) throws InvalidAddrressException {
		return 0;
	}
	

}
