package com.jniew.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jniew.springdemo.entity.Customer;
import com.jniew.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {		
	
		// get customers from service
		List<Customer> theCustomers = customerService.getCustomers();
		
		// add them to model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

}
