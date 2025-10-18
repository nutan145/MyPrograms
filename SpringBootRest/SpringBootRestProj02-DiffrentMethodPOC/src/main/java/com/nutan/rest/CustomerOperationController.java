package com.nutan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController 
{
	@GetMapping("/report")
	public ResponseEntity<String> showCustomerReport()
	{
		System.out.println("CustomerOperationController.showCustomerReport() (Get)");
		return new ResponseEntity<String>("use select operation",HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer()
	{
		System.out.println("CustomerOperationController.registerCustomer()(Post)");
		return new ResponseEntity<String>("use insert operation",HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer()
	{
		System.out.println("CustomerOperationController.updateCustomer()(Put)");
		return new ResponseEntity<String>("use update operation",HttpStatus.OK);
	}
	@PatchMapping("/emailUpdate")
	public ResponseEntity<String> updateEmail()
	{
		System.out.println("CustomerOperationController.updateEmail()(Patch)");
		return new ResponseEntity<String>("updateEmail operation",HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer()
	{
		System.out.println("CustomerOperationController.deleteCustomer()(Delete)");
		return new ResponseEntity<String>("delete operation",HttpStatus.OK);
	}
	
}
