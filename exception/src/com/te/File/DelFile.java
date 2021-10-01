package com.te.File;

import java.io.File;

public class DelFile {
	public static void main(String[] args) {
		File ref = new File("D:\\CORE JAVA\\TY Program\\FileIO\\Demo.txt");
		boolean b = ref.exists();
		if (b == true) {
			ref.delete();
			System.out.println("Del completed");
		} else {
			System.out.println("Not Found");
		}

	}

}
