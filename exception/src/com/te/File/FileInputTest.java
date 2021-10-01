package com.te.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileInputTest {
	public static void main(String[] args) {
		FileInputStreamMain f = new FileInputStreamMain();
		FileOutputStream fos=null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("D:\\CORE JAVA\\TY Program\\FileIO\\Demp.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(f);
			System.out.println("Write Completed");
		} catch (Exception e) {
			System.out.println("Write not completed");
		}
		finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				System.out.println("Not closed");
			}
			
			}
		}
	

}
