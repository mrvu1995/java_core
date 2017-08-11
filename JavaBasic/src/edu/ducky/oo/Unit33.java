package edu.ducky.oo;

public class Unit33 {
	public static void main(String[] args) {
		Unit33 u = new Unit33();
		System.out.println(u.add(5, 4));
		System.out.println(u.add(5.4f, 4.5f));
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	float add(float a, float b) {
		return a + b;
	}
}
// 2 phương thức cùng tên nhưng khác giá trị thì chính là overload