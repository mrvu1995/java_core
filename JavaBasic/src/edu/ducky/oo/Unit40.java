package edu.ducky.oo;

public class Unit40 {
	public static void main(String[] args) {
		Sup40 sup = new Sup40();
	}
}


class Super40 {
//	public Super40() {
//		System.out.println("Super");
//	}
	public Super40(int a) {
		
	}
}

class Sup40 extends Super40 {
	public Sup40() {
		//super(); lệnh này sẽ gọi đầu tiên trong mỗi class
		super(0);
	}
	
	public Sup40(int a) {
		//super();
		super(a);
	}
}