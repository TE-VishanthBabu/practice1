package com.te.exception.tcb;

public class ExceptionTest {
	public static void main(String[] args) {
		PracticeException pe=new PracticeException();
		String file="C:\\Users\\Vishanth babu M\\Desktop\\Read.txt";
		pe.getData(10, 0,file);
	}

}
