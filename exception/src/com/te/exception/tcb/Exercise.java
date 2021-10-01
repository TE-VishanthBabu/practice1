package com.te.exception.tcb;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int d=Integer.parseInt(scn.next());
		try { // nested try-catch block
			try {
				int a = 10;
				int b = 0;
				int c = a / b;
				System.out.println(c);
				
			} catch (Exception e) // try with generic catch block
			{
				System.out.println("Divide by zero is not possible");
			}
			
			System.out.println("This is executed");
			String a = null;
			System.out.println(a.length());
			
		} catch (NullPointerException n) {
			System.out.println("String is null");
			n.printStackTrace();
		}
		
		System.out.println("hai");

	}
}