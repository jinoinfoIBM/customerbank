package com.java.bank.services;

import org.springframework.stereotype.Service;

import com.java.bank.dto.CustomerResponseDto;

@Service
public class CustomerService {
	
	
	public CustomerResponseDto getCustomerDetails(String customerId) {
	
		
		
	CustomerResponseDto customerDetails = new CustomerResponseDto();
	customerDetails.setCustomerId(customerId);
	customerDetails.setCustomerName("Jino George");
	customerDetails.setCustomerAddress("11504, Floyd Dr, Overlanad park");
	customerDetails.setPhoneNumber("9139440649");
	
	return customerDetails;
	}
	
     }

