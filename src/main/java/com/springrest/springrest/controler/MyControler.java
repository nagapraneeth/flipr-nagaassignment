package com.springrest.springrest.controler;

  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Customer;
import com.springrest.springrest.repository.MyRepository;
@RestController
@RequestMapping("/customer")
public class MyControler {
	
	  @Autowired
	  private MyRepository myRepository;

	@GetMapping("/home")
	public ResponseEntity<List<Customer>> getCustomers()  {
		
		List<Customer> customerList =myRepository.findAll();
		return new ResponseEntity<>(customerList,HttpStatus.OK);
	}
}

