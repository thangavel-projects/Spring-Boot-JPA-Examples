package com.sample.springboot.domain;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.CustomerServiceImpl;
import com.sample.springboot.domain.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	public CustomerServiceImpl customerService; 
	
	@GET
	@RequestMapping("/customer")
	@Produces(MediaType.APPLICATION_JSON)
    public List<Customer> findAll() {	
    	return customerService.findAll();
    }

}