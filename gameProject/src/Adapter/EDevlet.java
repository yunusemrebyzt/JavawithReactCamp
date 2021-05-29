package Adapter;

import Abstract.CustomerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EDevlet  implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result =false;
		
		try
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getfirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
		}
		catch(Exception e)
		{
			System.out.println("Girdiginiz bilgiler dogru degil!!!");
		}
		return result;
		
	}

}
