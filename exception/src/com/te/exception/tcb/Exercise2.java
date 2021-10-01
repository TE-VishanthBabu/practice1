package com.te.exception.tcb;

public class Exercise2 {
	public static void main(String[] args)  {
		int a = 10;
		int b = 0;
		int c = a / b;
		try {
			Class.forName("com.te.exception.tcb.Exercise2");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
