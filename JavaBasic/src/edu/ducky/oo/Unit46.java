package edu.ducky.oo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Unit46 {
	public static void main(String [] args) {		
		try {
			File file = new File("Blog.txt");
			file.createNewFile();
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);			
			//DO something here
			String data = "Study and Share";
			bw.write(data + "\n");
			bw.write(data + "\n");
			bw.write(data + "\n");
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
