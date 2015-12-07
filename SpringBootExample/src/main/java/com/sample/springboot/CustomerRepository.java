package com.sample.springboot;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.springboot.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {
	
	 public List<Customer> findAll();
	 
}

