package edu.ducky.oo;

public class Unit24 {
	public static void main (String [] args) {
		Manager man = new Manager();
		man.show();
	}
}

interface Human {
	//cách khai báo
	public static final int AVG_AGE = 100;
	int AVG_WEIGHT = 60;
	
	public abstract void show();
	void Study();
}

class Manager implements Human {

	public void show() {
		System.out.println("AVG AGE: " + AVG_AGE);		
	}

	public void Study() {
		// TODO Auto-generated method stub
		
	}
	
}
