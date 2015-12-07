package com.sample.springboot;

import java.util.List;

import com.sample.springboot.domain.Customer;

public interface CustomerService {

	public List<Customer> findAll();
	
}
