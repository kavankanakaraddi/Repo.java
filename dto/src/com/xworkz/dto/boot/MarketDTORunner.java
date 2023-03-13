package com.xworkz.dto.boot;

import com.xworkz.dto.things.MarketDTO;

public class MarketDTORunner {

	public static void main(String[] args) {
		MarketDTO marketDTO = new MarketDTO();
		marketDTO.setMadeBy("MarketUnion");
		marketDTO.setName("K R Market");
		System.out.println(marketDTO.toString());
		System.out.println(marketDTO.hashCode());
		System.out.println(marketDTO.equals(marketDTO));
	}

}
