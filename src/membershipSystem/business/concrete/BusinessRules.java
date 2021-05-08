package membershipSystem.business.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import membershipSystem.entities.concretes.User;

public class BusinessRules  {
	
	public static boolean validatator(User user) {
		if(user.getFirstName().length()>2 && user.getLastName().length()>2 &&
				(user.getPassword().length()>=6) && emailControl(user.getEmail())) {
			
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean emailControl(String email) {
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		return matcher.matches();
	
	
	}
	

	

}
