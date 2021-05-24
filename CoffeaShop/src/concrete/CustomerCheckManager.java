package concrete;
import Abstract.ICustomerCheckService;
import entites.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
