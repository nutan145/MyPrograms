package com.nutan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message-api")
public class MessageRestController
{
	@GetMapping("/wish")
	public ResponseEntity<String> showMessage()
	{
		System.out.println("MessageRestController.showMessage()");
		return new ResponseEntity<String>("Good Morning", HttpStatus.OK);
	}
}
