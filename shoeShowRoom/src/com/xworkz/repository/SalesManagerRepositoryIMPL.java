package com.xworkz.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.dto.SalesManager;

@Component
public class SalesManagerRepositoryIMPL implements SalesManagerRepository {

	Collection<SalesManager> sal = new ArrayList<>();

	public SalesManagerRepositoryIMPL() {
		// TODO Auto-generated constructor stub
	}

	public SalesManagerRepositoryIMPL(Collection<SalesManager> sal) {
		super();
		this.sal = sal;
	}

	@Override
	public boolean save(SalesManager dto) {
		System.out.println("Running save method");

		return this.sal.add(dto);

	}

}
