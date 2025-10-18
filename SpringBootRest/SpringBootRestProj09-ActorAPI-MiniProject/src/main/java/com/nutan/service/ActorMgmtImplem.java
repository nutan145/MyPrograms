package com.nutan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutan.entity.ActorEntity;
import com.nutan.exceptions.ActorNotFoundException;
import com.nutan.repository.IActorRepository;
import com.nutan.vo.ActorVO;

@Service
public class ActorMgmtImplem implements IActorMgmtService 
{

	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String registerActor(ActorVO vo) 
	{
		//convert VO class obj to entity cass obj
		ActorEntity entity=new ActorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreatedBy(System.getProperty("user.name"));
		//save the object
		int idVal = actorRepo.save(entity).getAid();
		return "Actor obj is saved with the id value ::"+idVal ;
	}

	@Override
	public List<ActorVO> showAllActors() 
	{
		List<ActorEntity> listEntities = actorRepo.findAll();
		//copy listENtities to listVO
		List<ActorVO> listVO=new ArrayList();
		listEntities.forEach(entity->{
			ActorVO vo=new ActorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}

	@Override
	public ActorVO showActorById(int id)
	{
		//use repo
		ActorEntity entity = actorRepo.findById(id).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//convert entity to vo
		ActorVO vo=new ActorVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}

	@Override
	public List<ActorVO> showActorsByRemuneration(double start, double end) 
	{
		//use Repo
		List<ActorEntity> listEntity = actorRepo.showActorByRemuneration(start, end);
		//convert listEntity to vo
		List<ActorVO> listVO=new ArrayList();
		listEntity.forEach(entity->{
			ActorVO vo=new ActorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;

	}

	@Override
	public String updateActorRemuneration(int aid, double percent) {
		//use repo
		ActorEntity entity = actorRepo.findById(aid).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//update renumeration
		entity.setRemunaration(entity.getRemunaration()+(entity.getRemunaration()*percent/100.0));
		//save the object
		actorRepo.save(entity);
		return aid+"Actor Renumeration is updated";
	}

	@Override
	public String updateActor(ActorVO vo) 
	{
		//use repo
		ActorEntity entity = actorRepo.findById(vo.getAid()).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//copy vo obj data to enity
		BeanUtils.copyProperties(vo, entity);
		entity.setUpdatedBy(System.getProperty("user.name"));
		//update the object
		actorRepo.save(entity);
		return "Actor is updated";
	}

	@Override
	public String removeActorById(int id) 
	{
		//use repo
		ActorEntity entity = actorRepo.findById(id).orElseThrow(()->new ActorNotFoundException("invalid id"));
		//remove ACtor
		actorRepo.deleteById(id);
		return id+"Actor id is deleted";
	}

	@Override
	public String removeActorByCategory(String cat1, String cat2)
	{
		int count = actorRepo.deleteActorsByCategory(cat1, cat2);
		return count==0?"Actors not found":count+"no of actors are deleted";
	}

	
	
	

}
