package edu.ducky.oo;

import java.io.File;
import java.io.IOException;

public class Unit45 {
	public static void main (String [] args) {
		
		try {
			// Tạo một file
			File file = new File("test.txt");
			file.createNewFile();
			// Tạo một thư mục
			File directory = new File("new");
			directory.mkdir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
