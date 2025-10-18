package com.nutan.service;

import java.util.List;

import com.nutan.entity.Tourist;

public interface ITouristMgmtService 
{
	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourists();
	public List<Tourist> ShowAllTouristByCity(String city1,String city2);
	public Tourist displayFetchById(Integer id)throws TouristNotFoundException;
}
