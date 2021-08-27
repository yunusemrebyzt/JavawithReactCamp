package eCommerce.business.abstracts;

import eCommerce.entities.concretes.Customer;

public interface CustomerCheckService {

	boolean checkName(Customer customer);
	boolean checkSurname(Customer customer);
	boolean checkEmail(Customer customer);
	boolean checkPassword(Customer customer);
	boolean uniqueEmail(Customer customer);
	boolean isValid(Customer customer);
}
