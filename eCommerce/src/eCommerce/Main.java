package eCommerce;

import eCommerce.business.concretes.CustomerCheckManager;
import eCommerce.business.concretes.CustomerManager;
import eCommerce.business.concretes.VerificationManager;
import eCommerce.dataAccess.concretes.HibernateCustomerDao;
import eCommerce.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setName("Yunus");
		customer1.setSurname("Emre");
		customer1.setEmail("yunusemre1234@gmail.com");
		customer1.setPassword("yns1245454");
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setName("Sefa");
		customer2.setSurname("Kaya");
		customer2.setEmail("sefakaya1593@gmail.com");
		customer2.setPassword("sefa1234");
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(3);
		customer3.setName("Furkan");
		customer3.setSurname("Enes");
		customer3.setEmail("yunusemre1234@gmail.com");
		customer3.setPassword("furkan1234");
		
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager()
				, new VerificationManager()
				, new HibernateCustomerDao());
		
		customerManager.sýgnUp(customer1);
		customerManager.sýgnUp(customer2);
		customerManager.sýgnUp(customer3);
		customerManager.sýgnIn(customer2);
		
		
	}

}
