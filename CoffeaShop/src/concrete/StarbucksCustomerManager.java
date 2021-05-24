package concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import entites.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckServis;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckServis) {
		
		this.customerCheckServis = customerCheckServis;
	}

	
	@Override
	public void Save(Customer customer)  {
		
		if(customerCheckServis.CheckIfRealPerson(customer))
		{
			super.Save(customer);
		}
		else {
			
			System.out.println("Not a valid person");
		}
	}
	
	

	

}
