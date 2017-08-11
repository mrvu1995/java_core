package edu.ducky.oo;

import java.io.File;
import java.io.IOException;

public class Unit31 {
	public static void main(String [] args) {
		try {
			Thread.sleep(1000);
			File file = new File("test.txt");
			file.createNewFile();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			//Write log
			//Show dialog
			//Print cmd
		}
	}
}
