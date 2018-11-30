package com.jniew.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Size(min = 3, max = 20, message="Name entered is invalid. It must be between {2} and {1} characters.")
	@Pattern(regexp="^[a-zA-Z¹êóœ³¿æñŸ]+$", message="First name contains only letters")
	@NotEmpty(message = "Please enter your name")
	@Column(name="first_name")
	private String firstName;
	
	@Size(min = 3, max = 20, message="Last name entered is invalid. It must be between {2} and {1} characters.")
	@Pattern(regexp="^[a-zA-Z¹êóœ³¿æñŸ]+$", message="Last name contains only letters")
	@NotEmpty(message = "Please enter your last name")
	@Column(name="last_name")
	private String lastName;
	
	@Email(message = "Invalid email! Please enter vaild email.")
	@NotEmpty(message = "Please enter your email")
	@Column(name="email")
	private String email;

	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	
	
}
