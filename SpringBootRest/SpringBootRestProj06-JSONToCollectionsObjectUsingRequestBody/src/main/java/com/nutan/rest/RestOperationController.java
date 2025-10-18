package com.nutan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutan.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class RestOperationController 
{
	@PostMapping("/register")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer cust)
	{
		return new ResponseEntity<String>(cust.toString(),HttpStatus.OK);
	}
}
