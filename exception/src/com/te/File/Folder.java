package com.te.File;

import java.io.File;

public class Folder {
	public static void main(String[] args) {
		File ref=new File("D:\\CORE JAVA\\TY Program\\FileIO");
		boolean b=ref.exists();//is to check whether folder is present or not
		if(b==false) {
			ref.mkdir();//to make folder
			System.out.println("Folder Created");
		}
		else {
			System.out.println("Folder Exists");
		}
		
	}

}
