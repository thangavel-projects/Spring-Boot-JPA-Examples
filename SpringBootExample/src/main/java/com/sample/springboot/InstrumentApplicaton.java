package com.sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class InstrumentApplicaton {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(InstrumentApplicaton.class, args);
	}
	
}
