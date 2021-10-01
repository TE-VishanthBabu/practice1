package com.te.exception.tcb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticeException {

	public void getData(int a, int b, String file) {
		System.out.println(divide(a, b));
		fileReader(file);

	}

	public int divide(int a, int b) {
		if (a > 0 && b > 0) {
			return a / b;
		} else {
			return 0;
		}
	}

	public void fileReader(String file) {
		Scanner scn;
		try {
			scn = new Scanner(new File(file));
			while (scn.hasNext()) {
				System.out.println(scn.nextLine());
			}
			scn.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
