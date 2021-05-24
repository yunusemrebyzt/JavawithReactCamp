import java.time.LocalDate;
import java.time.LocalDateTime;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import adapter.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entites.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter())  ;
		customerManager.Save(new Customer(1,"Engin","Demiroð",LocalDate.of(1985, 01, 6),"28861499108"));
		 
		

	}     

}
