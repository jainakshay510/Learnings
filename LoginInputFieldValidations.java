package io.mosip.utils;

public class LoginInputFieldValidations {
	
	public static boolean passowrdValidation(String password) {
		
		return password.length()<=50?true:false;
	}

}
