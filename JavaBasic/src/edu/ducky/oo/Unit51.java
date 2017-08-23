package edu.ducky.oo;

import java.util.Vector;

public class Unit51 {
	public static void main(String [] args) {
		Vector<C1> vector = new Vector<C1>();
		vector.add(new C1());
		vector.add(new C1());
		vector.add(new D1());
		
		Vector<D1> vector1 = new Vector<D1>();
		vector1.add(new D1());
		vector1.add(new D1());
	}
}

class C1 {
	
}

class D1 extends C1 {
	
}
