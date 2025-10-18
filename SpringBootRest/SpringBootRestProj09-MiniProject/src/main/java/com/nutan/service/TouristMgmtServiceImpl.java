package com.nutan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutan.entity.Tourist;
import com.nutan.repo.ITouristRepo;

@Service("touristService")
public class TouristMgmtServiceImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepo touristRepo;
	
	@Override
	public String registerTourist(Tourist tourist) 
	{
		int idVal = touristRepo.save(tourist).getTid();
		return "Tourist is registered having the id value ::"+idVal;
	}

	@Override
	public List<Tourist> fetchAllTourists() 
	{
		List<Tourist> list = touristRepo.findAll();
		list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}

	@Override
	public List<Tourist> ShowAllTouristByCity(String city1, String city2) 
	{
		List<Tourist> list = touristRepo.findTouristByCities(city1, city2);
		return list;
	}

	@Override
	public Tourist displayFetchById(Integer tid)throws TouristNotFoundException
	{
		
		Optional<Tourist> id = touristRepo.findById(tid);
		return new Tourist(id);
	}

	

}
