package com.xworkz.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class SalesManager implements Serializable, Comparable<SalesManager> {

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String name;

	@Max(value = 10)
	@Min(value = 2)
	private int experience;

	@Min(value = 18)
	@Max(value = 60)
	private int age;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String qualification;

	@Override
	public int compareTo(SalesManager o) {
		return this.getQualification().compareTo(o.qualification);
	}

}
