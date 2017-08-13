package edu.ducky.oo;

public class Unit41 {
	public static void main(String [] args) {
		BookCase bc = new BookCase();
		bc.setColor("RED");
		System.out.println(bc.getColor());
	}
}

class BookCase {
	private int size;
	private String color;
	private boolean good;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean good) {
		this.good = good;
	}
	
}
