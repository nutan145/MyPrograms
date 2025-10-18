package com.nutan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company
{
	private Integer cid;
	private String cname;
	private Integer size;
	private String location;
}
