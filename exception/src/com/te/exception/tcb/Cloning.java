package com.te.exception.tcb;

public class Cloning  {
	public static void main(String[] args) {
		
		Example e1=new Example();
		e1.setEid(15);
		e1.setEname("vicky");
		e1.setSal(10000);
		System.out.println("before changes");
		Example e2=null;
		try {
			System.out.println("Ex "+e1);
			e2=(Example) e1.clone();
			System.out.println("Ex1 "+e2);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		System.out.println("After Changes");
		e1.setEid(20);
		e1.setSal(20000);
		System.out.println("Ex "+e1);
		System.out.println("Ex1 "+e2);
		

	}

}
