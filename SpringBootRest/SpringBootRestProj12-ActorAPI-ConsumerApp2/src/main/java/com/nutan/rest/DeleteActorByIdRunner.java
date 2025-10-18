package com.nutan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
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
		ResponseEntity<String> response = template.exchange(url,
																HttpMethod.DELETE,
																	null,
																		String.class,11);
		  // Process response
        System.out.println("Response Body (result): " + response.getBody());
        System.out.println("Response Headers: " + response.getHeaders());
        System.out.println("Response Status Code: " + response.getStatusCode().value());
        
       
		System.out.println("Actor Deleted");
		
		//use getFor
		System.exit(0);
		
	}

}
