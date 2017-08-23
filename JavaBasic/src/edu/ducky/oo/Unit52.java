package edu.ducky.oo;

import java.util.ArrayList;
import java.util.Iterator;

public class Unit52 {
	public static void main(String [] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ducky");
		al.add("Blog");
		al.add("StudyAndShare");
		
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
