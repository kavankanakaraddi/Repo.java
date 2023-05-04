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
public class PolishDTO implements Serializable, Comparable<PolishDTO> {

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String brand;

	@Min(value = 1)
	@Max(value = 25)
	private int quantity;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String colour;

	@Override
	public int compareTo(PolishDTO o) {
		// TODO Auto-generated method stub
		return this.getBrand().compareTo(o.getBrand());
	}

}
