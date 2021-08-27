package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Entity;

public class Customer implements Entity {
	private int customerId;
	private String name;
	private String surname;
	private String email;
	private String password;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String name, String surname, String email, String password) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
