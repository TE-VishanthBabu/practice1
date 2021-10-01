package com.te.exception.tcb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Vishanth babu M\\Desktop\\Read.txt");

		try {
			Scanner scn = new Scanner(file);
			while (scn.hasNext()) { 	
				System.out.println(scn.nextLine());
			}
			scn.close();

		}

		catch (FileNotFoundException e) {
			System.out.println("File is not found");
			e.printStackTrace();
		}

	}

}
