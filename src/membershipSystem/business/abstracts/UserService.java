package membershipSystem.business.abstracts;

import membershipSystem.entities.concretes.User;

public interface UserService {
	void register(User user);
    void login(User User);
	

}
