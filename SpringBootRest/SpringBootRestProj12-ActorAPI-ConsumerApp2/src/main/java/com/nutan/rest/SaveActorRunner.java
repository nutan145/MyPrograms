package com.nutan.rest;

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
public class SaveActorRunner implements CommandLineRunner 
{

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // API endpoint URL
        String url = "http://localhost:8082/SpringBootRestProj09-ActorAPI-MiniProject/actor-api/register";

        // JSON body excluding 'aid'
        String json_body = "{"
                + "\"aname\": \"Sreelela\","
                + "\"category\": \"Actress\","
                + "\"addrs\": \"Hyderabad\","
                + "\"remunaration\": 230000.0,"
                + "\"updatedBy\": \"admin\""
                + "}";

        // HTTP headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Prepare HttpEntity
        HttpEntity<String> entity = new HttpEntity<>(json_body, headers);

        // Invoke the endpoint
        ResponseEntity<String> response = template.exchange(url,
        														HttpMethod.POST,
        														entity,
        														String.class);

        // Process response
        System.out.println("Response Body (result): " + response.getBody());
        System.out.println("Response Headers: " + response.getHeaders());
        System.out.println("Response Status Code: " + response.getStatusCode().value());
        
        System.exit(0);
    }
}
