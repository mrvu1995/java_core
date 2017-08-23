package edu.ducky.oo;

import java.util.ArrayList;
import java.util.Vector;

public class Unit48 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Ducky");
		al.add(new String("StudyAndShare"));
		al.add(new Integer(5));
		al.add(new Long(10));
		System.out.println(al.get(1));
		al.remove(1);
		System.out.println(al.get(1));
		Object [] array = al.toArray();
		System.out.println(array.length + " " + al.size());
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		Vector vt = new Vector();		
//		Tương tự như ArrayList
	}
}
