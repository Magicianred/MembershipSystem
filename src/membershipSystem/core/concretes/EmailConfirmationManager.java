package membershipSystem.core.concretes;

import membershipSystem.core.abstracts.EmailConfirmationService;

public class EmailConfirmationManager implements EmailConfirmationService{

	@Override
	public void emailSent() {
		System.out.println("Mail adresinize doðrulama maili gönderildi");
		
	}

}
