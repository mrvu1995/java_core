package edu.ducky.oo;

public class Unit25 {
	public static void main (String [] args) {
		Boss b1 = new Boss();
		System.out.println(b1.age);
		System.out.println(b1.name);
		System.out.println(b1.address);
		// Không truy cập được numberOfWives vì nó là private
		// System.out.println(b1.numberOfWives);
		
		b1.showWives();
		b1.showName();		
		b1.showAddress();
		// Không truy cập được showAge vì nó là private
		//b1.showAge();
	}
}

class Boss {
	// Mọi nơi
	public int age;
	
	// Sử dụng trong package và các class con
	protected String name;
	
	// Sử dụng trong package
	String address;
	
	// Chỉ dùng trong class chứa nó
	private int numberOfWives;
	
	private void showAge() {
		System.out.println(age);
	}
	
	void showName() {
		System.out.println(age);
	}
	
	protected void showAddress() {
		System.out.println(age);
	}
	
	public void showWives() {
		System.out.println(age);
	}
}