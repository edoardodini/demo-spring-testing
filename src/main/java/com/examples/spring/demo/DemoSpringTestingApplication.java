package com.examples.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.examples.spring.demo.model.Employee;
import com.examples.spring.demo.repositories.EmployeeRepository;

@SpringBootApplication
public class DemoSpringTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringTestingApplication.class, args);
	}

}
