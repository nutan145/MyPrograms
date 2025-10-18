package com.nutan.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorVO 
{
	private Integer aid;
	private String aname;
	private String category;
	private String addrs;
	private Double remunaration;
	private String updatedBy;
}
