package com.nutan.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutan.model.Company;
import com.nutan.model.Customer;

@RestController
@RequestMapping("/company-api")
public class CompanyRestController 
{
	@GetMapping("/report")
	public ResponseEntity<Company> showComapnyData()
	{
		System.out.println("Company.showComapnyData()");
		Company comp=new Company(100,"HCL",120,"hyd");
		return new ResponseEntity<Company>(comp, HttpStatus.OK);
	}
	
	@GetMapping("/report2")
	public ResponseEntity<Customer>showCustomerData()
	{
		System.out.println("CompanyRestController.showCustomerData()");
		Customer cust=new Customer(200,"nutan",56784.98f,new String[] {"red","green","black"},List.of("Mca","Btech","Mba"),
				Set.of(78908657L,764376439L,938484783L),Map.of("AadharNo",7897654456L,"PanNo",8474783837L), 
				new Company(301,"wipro",340,"banglore"));
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
	
	@GetMapping("/report3")
	public ResponseEntity<List<Company>>showCompanyDetails()
	{
		System.out.println("CompanyRestController.showCompanyDetails()");
		Company cust1=new Company(10,"wipro",600,"hyd");
		Company cust2=new Company(11,"HCL",450,"pune");
		Company cust3=new Company(11,"Accenture",690,"Noida");
		return new ResponseEntity<List<Company>>(List.of(cust1,cust2,cust3),HttpStatus.OK);
		
	}
}
