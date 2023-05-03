package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfigurations {
	
	@Bean
	public String car() {
		return "Ferrari";
	}
	
	@Bean
	public String name() {
		return "Annesh";
	}
	
	@Bean
	public String guideName() {
		return "Kavan";
	}
	@Bean
	public String brandName() {
		return "FujiFilm";
	}
	@Bean
	public int noOfDoors() {
		return 20;
	}
	@Bean
	public int price() {
		return 60;
	}
	@Bean
	public String museumName() {
		return "LAL BAHDDUR SHASTRI MUSEUM";
		
	}




}
