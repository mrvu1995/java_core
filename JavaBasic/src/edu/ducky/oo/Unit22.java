package edu.ducky.oo;

public class Unit22 {
	public static void main(String [] args) {
		A a1 = new A();
		a1.setName("DuyVu");
		System.out.println(a1.getName());
		A a2 = new A();
		a2.setName("HongDuyen");
		System.out.println(a2.getName());
		
		B b1 = new B();
	}
}

class A {
	private String name;
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
}

class B {
	
}
