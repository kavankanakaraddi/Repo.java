package com.xworkz.weapon.service;

import com.xworkz.weapon.Exception.InvalidAddrressException;
import com.xworkz.weapon.Exception.InvalidFestivalException;
import com.xworkz.weapon.Repository.AddressRepository;
import com.xworkz.weapon.dto.AddressDTO;
import com.xworkz.weapon.util.AddressValidUtil;
import static com.xworkz.weapon.util.AddressValidUtil.*;

public class AddressServiceIMPL implements AddressService {

	private AddressRepository addressRepository;
	private String city;

	public AddressServiceIMPL(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public boolean validateAndThenSave(AddressDTO dto) throws InvalidAddrressException {
		if (dto != null) {
			System.out.println("DTO is not null,so Validate");
			String street = dto.getArea();
			String city = dto.getCity();
			int pincode = dto.getPincode();
			int floor = dto.getFloor();
			String number = dto.getNumber();
			String state = dto.getState();

			boolean validStreet = false;
			boolean validCity = false;
			boolean validPincode = false;
			boolean validfloor = false;
			boolean validNumber = false;
			boolean validState = false;

			if (AddressValidUtil.validString(street)) {
				System.out.println("Valid Street");
				return true;
			} else {
				System.out.println("invalid Street");
			}
			if (AddressValidUtil.validString(city)) {
				System.out.println("Valid city");
				return true;
			} else {
				System.out.println("invalid Street");
			}
			if (AddressValidUtil.validInt(pincode)) {
				System.out.println("Valid pincode");
				return true;
			} else {
				System.out.println("invalid pincode");
			}
			if (AddressValidUtil.validInt(floor)) {
				System.out.println("Valid floor");
				return true;
			} else {
				System.out.println("invalid floor");
			}

			if (AddressValidUtil.validString(number)) {
				System.out.println("Valid number");
				return true;
			} else {
				System.out.println("invalid number");
			}

			if (AddressValidUtil.validString(state)) {
				System.out.println("Valid state");
				return true;
			} else {
				System.out.println("invalid state");
			}
			if (AddressValidUtil.validFalg(validCity, validfloor, validNumber, validPincode, validState, validStreet,
					validState)) {
				System.out.println("Validation Done so saved");
				boolean exist = this.addressRepository.isExist(dto);
				if (!exist) {
					boolean save = this.addressRepository.save(dto);
					System.out.println("DTO is Not Duplicate So Save " + dto);
					return save;
				} else {
					System.err.println("DTO is Duplicate So Do Not Save  " + dto);
				}

			} else {
				throw new InvalidAddrressException("Data is Invalid");

			}
		} else {
			System.err.println("DTO is null so dont validate");
		}
		return false;

	}

	@Override
	public int count() {

		return this.addressRepository.getCount();
	}

	@Override
	public AddressDTO findByNumber(int number) throws InvalidAddrressException {
		if (validInt(number)) {
			return this.addressRepository.findByNumber(number);

		}
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) throws InvalidAddrressException {

		return this.addressRepository.find(dto);
	}

	@Override
	public AddressDTO findByStreet(String street) throws InvalidAddrressException {
		if (validString(street)) {
			return this.addressRepository.findByStreet(street);
		}
		return null;

	}

	@Override
	public AddressDTO findByPincode(int Pincode) throws InvalidAddrressException {
		if (validInt(Pincode)) {
			return this.addressRepository.findByPincode(Pincode);

		}
		return null;

	}

	@Override
	public AddressDTO findByStreetAndPincodeAndArea(String street, int pincode, String area)
			throws InvalidAddrressException {
		if (validInt(pincode) && validString(street) && validString(area)) {
			return this.addressRepository.findByStreetAndPincodeAndArea(street, pincode, area);

		}
		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String city, String state) throws InvalidAddrressException {
		if (validString(state) && validString(city)) {
			return this.addressRepository.findByCityAndState(city, state);
		}
		return null;
	}

	@Override
	public AddressDTO findFloorByNumber(int number) throws InvalidAddrressException {
		if (validInt(number)) {
			return this.addressRepository.findFloorByNumber(number);
		}
		return null;
	}

	@Override
	public String findCityNumberAndFloorAndStreetAndPincode(int number, int floor, String street, int pincode)
			throws InvalidAddrressException {
		if (validString(street) && validInt(number) && validInt(floor) && validInt(pincode)) {
			return this.addressRepository.findCityNumberAndFloorAndStreetAndPincode(number, floor, street, pincode);
		}
		return null;
	}
	@Override
	public int findPincodeByNumber(int number) throws InvalidAddrressException {
		if (validInt(number)) {
			return AddressService.super.findPincodeByNumber(number);
		}
		return 0;
	}

}
