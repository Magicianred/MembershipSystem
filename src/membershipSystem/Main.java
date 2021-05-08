package membershipSystem;
import membershipSystem.business.abstracts.UserService;
import membershipSystem.business.concrete.UserManager;
import membershipSystem.core.concretes.EmailConfirmationManager;
import membershipSystem.core.concretes.GoogleRegisterManagerAdapter;
import membershipSystem.dataAccess.concretes.DataUserDao;
import membershipSystem.entities.concretes.User;
import membershipSystem.googlesRegister.GoogleRegisterManager;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"Sema","Karbav","sema@karbav.com","123456");
		UserService userService=new UserManager(new DataUserDao(), new EmailConfirmationManager(),new GoogleRegisterManagerAdapter());
		userService.register(user);
		//userService.login(user);
	}

}
