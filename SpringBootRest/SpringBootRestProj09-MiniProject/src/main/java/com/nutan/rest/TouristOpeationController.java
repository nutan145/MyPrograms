package com.nutan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutan.entity.Tourist;
import com.nutan.service.ITouristMgmtService;

@RestController
@RequestMapping("/tourist")
public class TouristOpeationController 
{

  	@Autowired
	private ITouristMgmtService service;

    @PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist)
	{
		try
		{
			String resultMsg = service.registerTourist(tourist);
			return new ResponseEntity<String>(resultMsg,HttpStatus.CREATED);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>("problem in tourist enrollment",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
    @GetMapping("/findAll")
   	public ResponseEntity<?> displayTourists()
   	{
   		try
   		{
   			List<Tourist> list = service.fetchAllTourists();
   			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
   			
   		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			return new ResponseEntity<>("problem in fetching tourists",HttpStatus.INTERNAL_SERVER_ERROR);
   		}
   	}
    
    @GetMapping("/findAll/{city1}/{city2}")
   	public ResponseEntity<?> fetchTouristByCities(@PathVariable(required = false)String city1,
   													@PathVariable(required = false)String city2)
   	{
   		try
   		{
   			List<Tourist> list = service.ShowAllTouristByCity(city1, city2);
   			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
   			
   		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			return new ResponseEntity<>("Invalid city",HttpStatus.INTERNAL_SERVER_ERROR);
   		}
   	}
    
    @GetMapping("/find/{tid}")
   	public ResponseEntity<?> fetchTouristByCities(@PathVariable("tid")Integer tid)
   	{
   		try
   		{
   			service.displayFetchById(tid);
   			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
   			
   		}
   		catch(Exception e)
   		{
   			e.printStackTrace();
   			return new ResponseEntity<>("Invalid city",HttpStatus.INTERNAL_SERVER_ERROR);
   		}
   	}
}
