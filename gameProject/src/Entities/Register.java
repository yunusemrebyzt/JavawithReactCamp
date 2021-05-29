package Entities;

import Abstract.RegisterService;

public class Register implements RegisterService{

	@Override
	public void register(Gamer gamer) {
		System.out.println("Kayýt yapýldý : " + gamer.getfirstName());
		
	}
	public void update()
	{
		System.out.println("Bilgiler güncellendi");
	}
	
	public void delete()
	{
		System.out.println("Kayýt silindi");
	}
 
}
