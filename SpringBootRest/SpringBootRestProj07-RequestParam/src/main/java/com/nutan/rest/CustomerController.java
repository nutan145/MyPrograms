package com.nutan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController 
{
	@GetMapping("/report")
	public ResponseEntity<String> reportData(@RequestParam("cno")Integer no,
			@RequestParam("cname")String name)
	{
		System.out.println(no+"-----"+name);
		return new ResponseEntity<String>(no+"---"+name,HttpStatus.OK);
	}
	
	@GetMapping("/report1")
	public ResponseEntity<String> reportData1(@RequestParam("cno")Integer no,
			@RequestParam(required=false)String name)
	{
		System.out.println(no+"-----"+name);
		return new ResponseEntity<String>(no+"---"+name,HttpStatus.OK);
	}
}
