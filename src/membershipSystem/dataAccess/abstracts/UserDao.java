package membershipSystem.dataAccess.abstracts;

import java.util.List;

import membershipSystem.entities.concretes.User;

public interface UserDao {
	void add(User user); 
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getall();
	User getByMail(String email);

}
