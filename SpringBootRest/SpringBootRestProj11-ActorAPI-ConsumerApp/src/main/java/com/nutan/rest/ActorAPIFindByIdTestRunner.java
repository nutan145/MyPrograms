package com.nutan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class ActorAPIFindByIdTestRunner implements CommandLineRunner 
{
	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception 
	{
		//api endpoint url
		String url="http://localhost:8082/SpringBootRestProj09-ActorAPI-MiniProject/actor-api/find/{id}";
		//inovoke the endpoint
		ResponseEntity<String> response = template.getForEntity(url, String.class,7);
		//process response
		System.out.println("response Body(result)::"+response.getBody());
		System.out.println("response headers::"+response.getHeaders());
		System.out.println("response status code::"+response.getStatusCode());
		
		//use getFor
		
	}

}
