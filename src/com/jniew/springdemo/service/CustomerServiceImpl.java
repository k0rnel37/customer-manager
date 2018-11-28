package com.jniew.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jniew.springdemo.dao.CustomerDAO;
import com.jniew.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// inject customerDao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

}