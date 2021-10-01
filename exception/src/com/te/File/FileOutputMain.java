package com.te.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class FileOutputMain {
	public static void main(String[] args) throws Exception {
		FileInputStream fi=null;
		 
			fi=new FileInputStream("D:\\CORE JAVA\\TY Program\\FileIO\\Demp.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			
			FileInputStreamMain fe=(FileInputStreamMain)oi.readObject();
			System.out.println("read completed");
			System.out.println(fe.a);
			System.out.println(fe.s);
			
			
		
		
		
	
		}

}
