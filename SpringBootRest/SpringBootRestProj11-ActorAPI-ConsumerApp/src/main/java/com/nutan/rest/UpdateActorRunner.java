package com.nutan.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
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

//@Component
public class UpdateActorRunner implements CommandLineRunner {

    @Autowired
    private RestTemplate template;

    @Override
    public void run(String... args) throws Exception {
        // API endpoint URL
        String url = "http://localhost:8082/SpringBootRestProj09-ActorAPI-MiniProject/actor-api/update";

        // JSON body
        String json_body = "{"
                + "\"aid\": 9,"
                + "\"aname\": \"RamCharan\","
                + "\"category\": \"Star\","
                + "\"addrs\": \"Hyderabad\","
                + "\"remunaration\": 650000.0,"
                + "\"updatedBy\": \"admin\""
                + "}";

        // HTTP headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Prepare HttpEntity
        HttpEntity<String> entity = new HttpEntity<>(json_body, headers);

        // Invoke the endpoint
        template.put(url, entity);

        System.out.println("Actor updated");
        
        System.exit(0);
    }
}
