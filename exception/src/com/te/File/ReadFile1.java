package com.te.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
	public static void main(String[] args) {
		FileReader ref=null;
		try {
			ref=new FileReader("D:\\CORE JAVA\\TY Program\\FileIO\\demo.txt");
			try {
				int val=ref.read();
				while (val!=-1) {
					System.out.print((char)val);
					val=ref.read();
				}
			} catch (IOException e) {
				System.out.println("read operation failed");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		finally {
			try {
				ref.close();
			} catch (IOException e) {
				System.out.println("Close failed");
			}
		}
		
	}

}
