package com.sample.springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.sample.springboot.domain.Customer;

@Controller
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	public CustomerRepository customerRepository;
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
