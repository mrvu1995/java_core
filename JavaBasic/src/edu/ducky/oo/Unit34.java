package edu.ducky.oo;

public class Unit34 extends Tutorial {
	public static void main(String[] args) {
		Unit34 u = new Unit34();
		System.out.println(u.add(5, 4));
		System.out.println(u.add(5.4f, 4.5f));
		System.out.println(u.add("DuyVu", " HongDuyen"));
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	float add(float a, float b) {
		return a + b;
	}
}

class Tutorial{
	String add(String str1, String str2){
		return str1 + str2;
	}
}
