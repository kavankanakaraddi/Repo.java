package com.xworkz.weapon.boot;

import java.time.LocalDate;

import com.xworkz.weapon.constants.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.service.WeaponService;
import com.xworkz.weapon.service.WeaponServiceIMPL;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weaponDTO = new WeaponDTO(25,"AK47",Type.GUN,5000,"Iron","INDIA","Rockey",LocalDate.now(),"Army","BattleFields",3);
		System.out.println(weaponDTO);
		WeaponService service = new WeaponServiceIMPL();
		boolean saved=service.validateAndThenSave(weaponDTO);
		System.out.println("Saved:"+saved);
	}

}
