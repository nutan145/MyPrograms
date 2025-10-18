package com.nutan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nutan.entity.ActorEntity;

import jakarta.transaction.Transactional;

public interface IActorRepository extends JpaRepository<ActorEntity, Integer> 
{
	@Query("from ActorEntity where remunaration>=:start and remunaration<=:end order by aname asc")
	public List<ActorEntity> showActorByRemuneration(double start,double end);
	
	@Query("delete from ActorEntity where category in(:cat1,:cat2)")
	@Modifying
	@Transactional
	public int deleteActorsByCategory(String cat1,String cat2);
}
