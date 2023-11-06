package eee;

import java.util.ResourceBundle;

public class UserValidation {
	
	public boolean check(String uname,String pass){
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String name = rb.getString("username");
		String passw = rb.getString("password");
		if(name.equals(uname) && passw.equals(pass)) {
			return true;
		}else {
			return false;
		}
	}

}
