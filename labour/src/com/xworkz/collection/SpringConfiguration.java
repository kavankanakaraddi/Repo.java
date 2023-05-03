package com.xworkz.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.collection")
public class SpringConfiguration {
	@Bean
	public List<String> methof() {

		List<String> name = new ArrayList<>();
		name.add("kavan");
		name.add("Rakesh");
		name.add("Bhairavi");
		name.add("Annes");
		name.add("Annesh");

		return name;

	}

	@Bean
	public List<String> method() {

		List<String> list = new LinkedList<>();
		list.add("Adhar");
		list.add("pan");
		list.add("DL");
		list.add("Ration Card");
		list.add("Photo");

		return list;

	}

	@Bean
	public Set<String> match() {

		Set<String> address = new HashSet<>();
		address.add("Mudhol");
		address.add("Sai nagra");
		address.add("KK");
		address.add("RajkumarRoad");
		address.add("Rajghad");

		return address;

	}
	@Bean
	public Set<String> team() {

		Set<String> ipl = new LinkedHashSet<>();
		ipl.add("RCB");
		ipl.add("MI");
		ipl.add("KKR");
		ipl.add("SRH");
		ipl.add("DC");

		return ipl;

	}
	@Bean
	public Set<String> cars() {

		Set<String> car = new TreeSet<>();
		car.add("i20");
		car.add("i10");
		car.add("i10 Grand");
		car.add("i10 neo");
		car.add("i20 sportz");

		return car;

	}
}
