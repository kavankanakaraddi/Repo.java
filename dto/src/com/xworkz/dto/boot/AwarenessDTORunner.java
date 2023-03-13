package com.xworkz.dto.boot;

import com.xworkz.dto.things.AwarenessDTO;

public class AwarenessDTORunner {
	public static void main(String[] args) {
		AwarenessDTO awarenessDTO = new AwarenessDTO();
		awarenessDTO.setFollowing(false);
		awarenessDTO.setGivenBy("GOVERNMENT");
		awarenessDTO.setPlace("BENGALURU");
		System.out.println(awarenessDTO.equals(awarenessDTO));
		System.out.println(awarenessDTO.toString());
		System.out.println(awarenessDTO.hashCode());
		
	}

}
