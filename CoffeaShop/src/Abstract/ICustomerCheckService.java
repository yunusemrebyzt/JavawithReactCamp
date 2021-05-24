package Abstract;
import entites.Customer;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer);
}
