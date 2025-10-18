package com.nutan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOperationController
{
	@GetMapping("/report/{cno}/{cname}")
	public ResponseEntity<String> opeartionController(@PathVariable("cno")Integer no,
			@PathVariable("cname")String name)
	{
		return new ResponseEntity<String>(no+"......"+name,HttpStatus.OK);
	}
}
