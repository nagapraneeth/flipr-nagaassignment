package com.springrest.springrest.controler;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Customer;

@RestController
public class test1 {
	@GetMapping("/home1")
	public String getCustomers()  {
		
		return "People";
	}
}
