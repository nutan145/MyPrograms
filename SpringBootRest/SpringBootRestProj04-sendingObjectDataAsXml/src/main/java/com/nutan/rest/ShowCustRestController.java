package com.nutan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutan.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class ShowCustRestController 
{
	@GetMapping("/report")
	public ResponseEntity<Customer> showCustomerData()
	{
		System.out.println("ShowCustRestController.showCustomerData()");
		Customer cust=new Customer(101,"Nutan","Hyd",4500f);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);		
	}
	
	@PostMapping("/register")
	public String CustomerOperationController(@RequestBody Customer cust)
	{
		return cust.toString();
	}
}
