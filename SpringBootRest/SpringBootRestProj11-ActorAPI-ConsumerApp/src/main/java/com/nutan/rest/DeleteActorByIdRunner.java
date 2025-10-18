package com.nutan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class DeleteActorByIdRunner implements CommandLineRunner 
{
	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception 
	{
		//api endpoint url
		String url="http://localhost:8082/SpringBootRestProj09-ActorAPI-MiniProject/actor-api/delete/{id}";
		//inovoke the endpoint
		template.delete(url,9);
		//process response
		System.out.println("Actor Deleted");
		
		//use getFor
		
	}

}
