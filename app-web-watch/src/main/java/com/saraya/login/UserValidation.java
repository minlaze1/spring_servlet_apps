package com.saraya.login;

public class UserValidation {
	public boolean isValid(String usr,String pw) {
		if(usr.equalsIgnoreCase("lamine") && pw.equals("mypass")) {
		           
		return true; 
		}
		
			return false;
		
	}
}

