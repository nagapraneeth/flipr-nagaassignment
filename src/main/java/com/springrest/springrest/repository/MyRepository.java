package com.springrest.springrest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entity.Customer;

@Repository
public interface MyRepository extends MongoRepository<Customer, String> {

  //SupportedTimezone findAllByTimezoneIdentifier(String timezoneIdentifier);
	
}