package membershipSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import membershipSystem.dataAccess.abstracts.UserDao;
import membershipSystem.entities.concretes.User;

public class DataUserDao implements UserDao{

	List<User> users = new ArrayList<User>(); 
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kayýt baþarýyla eklendi "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		for(User item:users) {
			if(item.getId()==user.getId()) {
			    users.remove(item.getId());
			    System.out.println("Kayýt Silindi");
			}
			else {
				System.out.println("Kayýt Silinirken hata oluþtu");
			}
			
		}
		
	}

	@Override
	public void update(User user) {
		
		User userUpdate=users.get(user.getId());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setFirstName(user.getFirstName());
		System.out.println("Kayýt Güncellendi");
				
		
	}

	@Override
	public User get(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getall() {
		
		return users;
	}

	@Override
	public User getByMail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
