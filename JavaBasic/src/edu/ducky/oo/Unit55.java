package edu.ducky.oo;

public class Unit55 {
	public static void main(String [] args) {
		Thread55 thread55 = new Thread55();
		Thread thread1 = new Thread(thread55);
		Thread thread2 = new Thread(thread55);
		
		thread1.setName("Ducky");
		thread2.setName("Clover");
		
		thread1.start();
		thread2.start();
	}
}

class Thread55 implements Runnable {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		} catch (InterruptedException e){
		}
		
	}
	
}
