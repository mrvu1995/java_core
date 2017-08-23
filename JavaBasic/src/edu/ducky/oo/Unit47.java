package edu.ducky.oo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Unit47 {
	public static void main(String [] args) {
		File file = new File("blog.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			int i = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(++i + ": " + line);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {			
		}
	}
}
