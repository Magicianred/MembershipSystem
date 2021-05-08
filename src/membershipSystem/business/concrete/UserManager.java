package membershipSystem.business.concrete;

import membershipSystem.business.abstracts.UserService;
import membershipSystem.core.abstracts.EmailConfirmationService;
import membershipSystem.core.abstracts.GoogleService;
import membershipSystem.dataAccess.abstracts.UserDao;
import membershipSystem.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private EmailConfirmationService emailConfirmation;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao,EmailConfirmationService emailConfirmation,GoogleService googleService) {
		this.userDao=userDao;
		this.emailConfirmation=emailConfirmation;
		this.googleService=googleService;
	}

	@Override
	public void register(User user) {
		if(BusinessRules.validatator(user)) {
			userDao.add(user);
			emailConfirmation.emailSent();
			googleService.registerToSystem("Google ile kay�t olundu "+user.getFirstName());
		}
		else {
			System.out.println("Kullan�c� kay�t olurken hata olu�tu");
		}
		
	}

	


	@Override
	public void login(User user) {
		if(BusinessRules.validatator(user))
		{
		     System.out.println("Giri� ba�ar�l�");
		}
		
		else
		{
			System.out.println("Hata");
		}
		
	}

	
	
}
