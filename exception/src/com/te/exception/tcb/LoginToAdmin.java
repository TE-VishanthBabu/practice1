package com.te.exception.tcb;

public class LoginToAdmin {

	public void login(String username, String pwd) {
		if (username.equalsIgnoreCase("admin")) {
			if (pwd.equalsIgnoreCase("admin123")) {
				System.out.println("Login Success");
			} else {
				throw new InvalidCredentialException("wrong password");
			}
		} else {
			throw new InvalidCredentialException("wrong credentials");
		}

	}

}
