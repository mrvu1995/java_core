package edu.ducky.oo;

public class Unit28 {
	int number;
	final float PI = 3.14f;
	
	public static void main (String [] args) {
		Unit28 test = new Unit28();
		test.number = 15;
		// PI đã khai báo là hằng số
		//test.PI = 3.15f;
	}
	
	public void change() {
		number = 30;
		//PI = 3.18f;
	}	
	
	void show() {
		
	}
}

final class Unit {
	final void show() {
		
	}
}

// Không thay đổi giá trị, thuộc tính, phương thức và không được thừa kế khi có final