package edu.ducky.basic;

public class SwitchDemo {
	public static void main(String [] args) {
		int age = 10;
		switch (age) {
		case 10:
			System.out.println("Ten");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
//Dù default có ở đâu thì vẫn sẽ chạy sau cùng.