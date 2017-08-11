package edu.ducky.oo;

public class Unit32 {
	public static void main(String [] args) {
		Building b = new Building();
		try {
			b.go();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyException extends Exception {
	// Do something
}

class Building {
	public void show () throws MyException {
		throw new MyException();
	}
	
	public void go () throws InterruptedException {
		Thread.sleep(1000);
	}
}
