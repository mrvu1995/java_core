package edu.ducky.oo;

public class Unit37 {
	enum COLOR {RED, BLUE, YELLOW, GREEN};
	
	public static void main(String[] args) {
		System.out.println(COLOR.BLUE);
		COLOR c = COLOR.YELLOW;
		System.out.println(c);
		System.out.println(c.YELLOW);
		
		if (c == COLOR.GREEN) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		switch(c) {
		case RED:
			System.out.println("Red");
			break;
		case BLUE:
			System.out.println("Blue");
			break;
		case YELLOW:
			System.out.println("Yellow");
			break;
		case GREEN:
			System.out.println("Green");
			break;
		}
	}
}
