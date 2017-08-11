package edu.ducky.basic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {
	public static void main(String [] args) {
		//Get time by millis
		long start = System.currentTimeMillis();
		
		try {
			for (int i = 0; i < 1000; i++) {
//				Thread.sleep(2);
			}
		} catch (Exception e) {
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Get time by millis: " + (end - start));
		
		//Get time by nano
		start = System.nanoTime();
		try {
			for (int i = 0; i < 1000; i++) {
//				Thread.sleep(2);
			}
		} catch (Exception e) {
			
		}
		end = System.nanoTime();
		System.out.println("Get time by nano: " + (end - start));
		
		//Display the system time
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String day = dateFormat.format(date);
		System.out.println(day);
	}
}
