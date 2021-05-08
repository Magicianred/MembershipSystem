package membershipSystem.core.concretes;

import membershipSystem.core.abstracts.GoogleService;
import membershipSystem.googlesRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleService {

	@Override
	public void registerToSystem(String message) {
		GoogleRegisterManager googleRegisterManager=new GoogleRegisterManager();
		googleRegisterManager.register(message);
		
	}

}
