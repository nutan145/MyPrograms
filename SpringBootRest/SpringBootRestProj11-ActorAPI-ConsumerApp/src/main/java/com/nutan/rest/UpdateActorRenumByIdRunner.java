package com.nutan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//package com.nutan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UpdateActorRenumByIdRunner implements CommandLineRunner 
{

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception 
    {
        // API endpoint URL
        String url = "http://localhost:8082/SpringBootRestProj09-ActorAPI-MiniProject/actor-api/update/{id}/{percent}";
        
        template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        //use patchForObject()method
        String result = template.patchForObject(url, null, String.class,13,10.0);
        //process the response
        System.out.println("response body(result)::"+result);


        System.out.println("Actor updated");
        
        System.exit(0);
    }
}
