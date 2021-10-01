package com.te.File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		FileWriter ref=null;
		try {
			ref=new FileWriter("D:\\CORE JAVA\\TY Program\\FileIO\\Demo.txt");
			ref.write("hai");
			ref.write("\n");
			ref.write("hello world");
			ref.flush();
			System.out.println("Write Completed");
		} catch (IOException e) {
			System.out.println("Write Failed");
		}
		finally {
			try {
				ref.close();
			} catch (IOException e) {
				System.out.println("Close Operation Failed");
			}
		}
		
	}

}
