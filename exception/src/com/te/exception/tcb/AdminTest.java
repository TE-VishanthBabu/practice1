package com.te.exception.tcb;

import java.util.Scanner;

public class AdminTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the username");
		String username = scn.next();

		System.out.println("Enter the password");
		String pwd = scn.next();

		LoginToAdmin la = new LoginToAdmin();

		try {
			la.login(username, pwd);
		} catch (InvalidCredentialException e) {
			System.out.println(e.getMessage());
		}
	}

}
