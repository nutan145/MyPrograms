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
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
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
        ResponseEntity<String> response= template.exchange(url, 
        										HttpMethod.PATCH,
        											null,
        												String.class,15,20.0);
        // Process response
        System.out.println("Response Body (result): " + response.getBody());
        System.out.println("Response Headers: " + response.getHeaders());
        System.out.println("Response Status Code: " + response.getStatusCode().value());
    

        System.out.println("Actor updated");
        
        System.exit(0);
    }
}
