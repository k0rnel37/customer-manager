package com.jniew.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jniew.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		//get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		
		//execute query
		List<Customer> customers = theQuery.getResultList();
		
		//return list<customer>
		return customers;
	}

}
