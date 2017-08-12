package edu.ducky.oo;

public class Unit39 {
	public static void main(String [] args) {
		Box b1 = new Box();
		System.out.println(b1.getSize());
		System.out.println(b1.getColor());
		
		Box b2 = new Box(15, "Yellow");
		System.out.println(b2.getSize());
		System.out.println(b2.getColor());
	}
}

class Box {
	private int size;
	private String color;
	
	public Box() {
		size = 10;
		color = "RED";
		//Call orther methods
		System.out.println("Study and share");
	}
	
	public Box(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}
}