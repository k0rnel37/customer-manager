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
	public List<Customer> getCustomers() {
		
		//get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query - sort by last name
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		//execute query
		List<Customer> customers = theQuery.getResultList();
		
		//return list<customer>
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		//get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer to database
		currentSession.save(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		
		//get the current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// retrieve from database using id
		Customer theCustomer = currentSession.get(Customer.class, theId);
		
		return theCustomer;
	}



}
