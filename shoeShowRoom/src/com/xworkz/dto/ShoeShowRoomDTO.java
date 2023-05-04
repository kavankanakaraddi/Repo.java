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
public class ShoeShowRoomDTO implements Serializable, Comparable<ShoeShowRoomDTO> {

	@Max(value = 20, message = "Value Should not be Greater then 20")
	@Min(value = 1, message = "Value Should not be Lesser then 1")
	private int id;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String name;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String address;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String gstNo;

	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		return this.getName().compareTo(gstNo);
	}

}
