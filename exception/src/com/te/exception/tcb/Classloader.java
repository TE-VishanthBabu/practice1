package com.te.exception.tcb;

public class Classloader {
	public static void main(String[] args) {
		try {
			//if class is found,it will load sucessfully or it shows classnotfound exception
			Example e2=(Example) Class.forName("com.te.exception.tcb.Example").newInstance();
			e2.setEid(10);
			e2.setEname("vivek");
			e2.setSal(50000);
			System.out.println(e2);
			System.out.println("loaded class Successfully");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
