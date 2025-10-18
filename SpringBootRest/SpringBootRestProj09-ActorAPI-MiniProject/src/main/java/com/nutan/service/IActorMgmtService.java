package com.nutan.service;

import java.util.List;

import com.nutan.vo.ActorVO;

public interface IActorMgmtService 
{
	public String registerActor(ActorVO vo);
	public List<ActorVO> showAllActors();
	public ActorVO showActorById(int id);
	public List<ActorVO> showActorsByRemuneration(double start,double end);
	public String updateActorRemuneration(int aid,double percent);
	public String updateActor(ActorVO vo);
	public String removeActorById(int id);
	public String removeActorByCategory(String cat1,String cat2);
}
