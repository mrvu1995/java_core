package edu.ducky.oo;

public class Unit23 {
	public static void main(String [] args) {
		Outer out = new Outer();
		out.show();
	}
}

class Outer {
	public void show () {
		Inner in = new Inner();
	}
	
	class Inner {
		public void display() {
			System.out.println("I am an inner class");
		}
	}
}

class C {
	public void show() {
		Outer.Inner in = new Outer().new Inner();
		in.display();
	}
}