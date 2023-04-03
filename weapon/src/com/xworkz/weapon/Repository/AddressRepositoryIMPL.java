package com.xworkz.weapon.Repository;

import com.xworkz.weapon.Exception.AddressMemoryFullException;
import com.xworkz.weapon.Exception.InvalidAddrressException;
import com.xworkz.weapon.dto.AddressDTO;

public class AddressRepositoryIMPL implements AddressRepository {
	private AddressDTO[] addressDTO = new AddressDTO[3];
	private int indexAddressDTO = 0;
	private Object city;

	@Override
	public boolean save(AddressDTO dto) {
		if (this.indexAddressDTO < this.addressDTO.length) {
			this.addressDTO[indexAddressDTO] = dto;
			indexAddressDTO++;
			return true;

		} else {
			System.err.println("Memory is full,cannot add more files,max allowed is 3");
			throw new AddressMemoryFullException("Memory is full cannot add festivals..");
		}
	}

	@Override
	public boolean isExist(AddressDTO dto) throws AddressMemoryFullException {
		if (this.indexAddressDTO == 0) {
			System.out.println("First Elements Will not Check");
			return false;
		} else {
			System.out.println("First Elements Onwords Will Check");
			for (int i = 0; i < this.indexAddressDTO; i++) {
				AddressDTO temp = addressDTO[i];
				if (temp.equals(dto)) {
					System.out.println("AddressDTO is Already Exists");
					return true;
				}
			}

			throw new AddressMemoryFullException("Memory is Full");
		}

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int total() {
		return 0;
	} 

	@Override
	public AddressDTO findFloorByNumber(int number) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp = this.addressDTO[index];
			if (temp.getFloor() == number) {
				System.out.println("This Number is Present in dto : " + number);
				return temp;
			} else {
				System.out.println("This Number is Present in dto :" + number);
			}
		}
		return null;
	}

	@Override
	public boolean find(AddressDTO dto) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp1 = this.addressDTO[index];
			if (temp1.equals(dto)) {
				System.out.println("This dto is present : " + dto);
				return true;
			}
		}
		return false;

	}

	@Override
	public AddressDTO findByStreet(String street) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp2 = this.addressDTO[index];
			if (temp2.getStreet().equals(street)) {
				System.out.println("This Street is present in dto : " + street);
				return temp2;
			} else {
				System.out.println("This Street is not present in dto : " + street);
			}

		}
		return null;
	}

	

	@Override
	public AddressDTO findByPincode(int Pincode) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp3 = this.addressDTO[index];
			if (temp3.getPincode() == Pincode) {
				System.out.println("This Pincode is present in dto : " + Pincode);
				return temp3;
			} else {
				System.out.println("This Pincode is  not present in dto : " + Pincode);

			}
		}
		return null;
	}

	@Override
	public AddressDTO findByStreetAndPincodeAndArea(String street, int pincode, String area) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp4 = this.addressDTO[index];
			if (temp4 != null && temp4.getPincode() == pincode && temp4.getArea().equals(area)
					&& temp4.getStreet().equals(street)) {
				System.out.println(
						"This pincode, Area, Street is present in dto :" + pincode + " " + area + " " + street + " ");
				return temp4;
			} else {
				System.out.println("This pincode, Area, Street is  not present dto ");

			}
		}

		return null;
	}

	@Override
	public AddressDTO findByCityAndState(String stree, String state) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp5 = this.addressDTO[index];
			if (temp5.getCity().equals(city) && temp5.getState().equals(state)) {
				System.out.println("This City, State is present in dto : " + city + " " + state + " ");
				return temp5;
			} else {
				System.out.println("This City, State is not  present in dto : ");

			}

		}

		return null;
	}

	public String findCityNumberAndFloorAndStreetAndPincode(String number, int floor, String street, int pincode) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp6 = this.addressDTO[index];
			if (temp6.getNumber() == number && temp6.getFloor() == floor && temp6.getPincode() == pincode
					&& temp6.getStreet().equals(street)) {
				System.out.println("This Number,Floor,Street,Pincode is Present in dto " + floor + " " + pincode + " "
						+ street + " " + number + " ");
				String cityName = temp6.getCity();
				return cityName;
			} else {
				System.out.println("This Number,Floor,Street,Pincode is Present in dto ");
			}

		}

		return null;
	}

	public AddressDTO findPincodeByNumber(String number) {
		for (int index = 0; index < this.addressDTO.length; index++) {
			AddressDTO temp7 = this.addressDTO[index];
			if (temp7.getNumber() == number) {
				System.out.println("The number is present in dto :" + number);
				int pinCodeNum = temp7.getPincode();
				return null;
			}else {
				System.out.println("The number is not present in dto :");

			}

		}

		return null;
	}

}
