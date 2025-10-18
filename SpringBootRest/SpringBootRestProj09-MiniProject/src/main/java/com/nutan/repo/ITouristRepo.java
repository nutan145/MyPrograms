package com.nutan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nutan.entity.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> 
{
	@Query("from Tourist where city in(:city1,:city2)order by name asc")
	public List<Tourist> findTouristByCities(String city1,String city2);
}
