package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List<Customer> getAll();
}
