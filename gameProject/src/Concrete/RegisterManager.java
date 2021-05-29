package Concrete;

import Abstract.CustomerCheckService;
import Entities.Gamer;
import Entities.Register;

public class RegisterManager extends Register {

	private CustomerCheckService customerCheckService;

	public RegisterManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	
	public void register(Gamer gamer)
	{
		if(customerCheckService.CheckIfRealPerson(gamer))
		{
			super.register(gamer);
		}
		else {
			
			System.out.println("Not a valid person");
		}
	}
}

