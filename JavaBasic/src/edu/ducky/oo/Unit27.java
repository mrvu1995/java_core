package edu.ducky.oo;

public class Unit27 {
	public static void main(String [] args) {
		Room r1 = new Room();
		r1.number = 10;
		System.out.println("R1.number: " + r1.number);
		System.out.println("R1.area before: " + r1.area);
		r1.area = 300;
		System.out.println("R1.area after: " + r1.area);
		
		Room r2 = new Room();
		r2.number = 20;
		System.out.println("R1.number: " + r2.number);
		System.out.println("R2.area: " + r2.area);
		
		Room r3 = new Room();
		r3.number = 30;
		System.out.println("R3.number: " + r3.number);
		System.out.println("R3.area: " + Room.area);
		
	}
}

class Room {
	static int area = 200;
	int number;
	
	public static void show() {
		System.out.println("Show");
		area = 500;
		// Không sử dụng được number
	}
}