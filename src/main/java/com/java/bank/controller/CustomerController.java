package com.java.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.bank.dto.CustomerResponseDto;
import com.java.bank.services.CustomerService;

@RequestMapping("/customer")
@CrossOrigin (origins ="*", allowedHeaders ="*")
@RestController
public class CustomerController{
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping ("/v1/customerDetails")
	public ResponseEntity<CustomerResponseDto> getCustomerDetails(@RequestParam (name ="customerId") String customerId) {
		
		CustomerResponseDto customer =customerService.getCustomerDetails("10");
		
	 	return new ResponseEntity<CustomerResponseDto>(customer, HttpStatus.OK);
	}
	
}
