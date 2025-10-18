package com.nutan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address 
{
	private Integer houseNo;
	private String houseName;
	private String location;
	private Integer pincode;
}
