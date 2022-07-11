package spring.intro;

import org.springframework.stereotype.Component;

@Component("login")
public class LoginService {
	
	public boolean isValidUser(String username, String password) {
		if(username.equals("abhishek") && password.equals("123"))
			return true;
		return false;
	}

}
