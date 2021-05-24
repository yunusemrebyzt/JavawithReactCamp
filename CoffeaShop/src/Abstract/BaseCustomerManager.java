package Abstract;

import entites.Customer;



public abstract class BaseCustomerManager implements ICostumerService {

	@Override
	public void Save(Customer customer) {
			
			System.out.println("Saved to db : " + customer.getFirstName());
		
	}
	
	
	
}
  