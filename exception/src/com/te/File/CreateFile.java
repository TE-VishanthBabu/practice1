package com.te.File;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File ref = new File("D:\\CORE JAVA\\TY Program\\FileIO\\Demo.txt");
		boolean b = ref.exists();
		if (b == false) {
			try {
				ref.createNewFile();
				System.out.println("File created");
			} catch (IOException e) {
				System.out.println("File Creation failed");
			}
		} else {
			System.out.println("File already exist");
		}
	}
}
