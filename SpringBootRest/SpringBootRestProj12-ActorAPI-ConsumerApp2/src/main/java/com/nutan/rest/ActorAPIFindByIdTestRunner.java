package com.nutan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nutan.actorVO.ActorVO;

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
		ResponseEntity<String> response=template.exchange(url, 
															HttpMethod.GET, 
																null, 
																	String.class,7);
		//process the response
		System.out.println("response body(result)::"+response.getBody());
		System.out.println("response headers::"+response.getHeaders());
		System.out.println("response status code::"+response.getStatusCode().value());
		 System.out.println("===================================");
		 ObjectMapper mapper=new ObjectMapper();
		 ActorVO list = mapper.readValue(response.getBody(),ActorVO.class);
		 System.out.println("json array to List<ActorVO> Object"+list);
		 
		 System.exit(0);
		
	}

}
