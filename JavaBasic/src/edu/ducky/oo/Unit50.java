package edu.ducky.oo;

import java.util.ArrayList;
import java.util.HashMap;

public class Unit50 {
	public static void main (String [] args) {
		ArrayList<A1> al = new ArrayList<A1>();
		al.add(new A1());
		al.add(new A1());
		for (int i = 0; i < al.size(); i++) {
			al.get(i).show();
		}
		
		HashMap<String, B1> map = new HashMap<String, B1>();
		map.put("Ducky", new B1());
	}
}

class A1 {
	public void show() {
		
	}
}

class B1 {
	public void go() {
		
	}
}