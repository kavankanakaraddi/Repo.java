package com.xworkz.weapon.boot;

import com.xworkz.weapon.Exception.InvalidAddrressException;
import com.xworkz.weapon.Repository.AddressRepository;
import com.xworkz.weapon.Repository.AddressRepositoryIMPL;
import com.xworkz.weapon.dto.AddressDTO;
import com.xworkz.weapon.service.AddressService;
import com.xworkz.weapon.service.AddressServiceIMPL;

public class AddressRunner {

	public static void main(String[] args) throws InvalidAddrressException {
		
		AddressDTO addressDTO = new AddressDTO("Navarang","Rajaji Nagar", 587313,1,123 , "Bengaluru", "Karnataka");
		AddressRepository addressRepository = new AddressRepositoryIMPL();
		AddressService addressService = new AddressServiceIMPL(addressRepository);
		boolean saved = addressService.validateAndThenSave(addressDTO);
		System.out.println(saved);
		
		System.out.println(" ");
		System.out.println(addressService.findFloorByNumber(123));
		System.out.println(" ");
		System.out.println(addressService.find(addressDTO));
		System.out.println(" ");
		System.out.println(addressService.findPincodeByNumber(587));
		System.out.println(" ");
		System.out.println(addressService.findByCityAndState("Bengaluru","Karanataka"));
		System.out.println(" ");
		System.out.println(addressService.findByNumber(1));
		System.out.println(" ");
		System.out.println(addressService.findByPincode(587313));
		System.out.println(" ");
		System.out.println(addressService.findByStreet("Navarang"));
		System.out.println(" ");
		System.out.println(addressService.findByStreetAndPincodeAndArea("Navarang", 587313,"Rajaji Nagar"));
		System.out.println(addressService.findCityNumberAndFloorAndStreetAndPincode(123, 1, "Navarang", 587313));












	}

}
