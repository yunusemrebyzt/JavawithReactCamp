package eCommerce.business.abstracts;

import eCommerce.entities.concretes.Customer;

public interface CustomerService {
	void sýgnIn(Customer customer);
	void sýgnUp(Customer customer);
}
