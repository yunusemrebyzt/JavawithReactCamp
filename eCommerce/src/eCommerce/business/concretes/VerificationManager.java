package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {

	List<String> emailList = new ArrayList<String>();
	
	
	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email +" isimli e-mail'e dogrulama kodu gönderildi ");
		
	}

	@Override
	public void verifyMail(String email) {
		emailList.add(email);
		System.out.println("Dogrulama basarili bir sekilde yapýldý ");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		
		if(emailList.contains(email)) {
			return true;
		}
		return false;
	}

}
