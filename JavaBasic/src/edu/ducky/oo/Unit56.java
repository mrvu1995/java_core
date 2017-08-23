package edu.ducky.oo;

public class Unit56 {
	public static void main(String [] args) {
		Thread56 thread56 = new Thread56();
		Thread thread1 = new Thread(thread56);
		Thread thread2 = new Thread(thread56);
		
		thread1.setName("Ducky");
		thread2.setName("Clover");
		
		thread1.start();
		thread2.start();
	}
}



class Thread56 implements Runnable {
	
	private int money = 1000;
	
	public synchronized void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1);
				System.out.println(Thread.currentThread().getName() + " " + i + " " + money-- );				
			}
		} catch (InterruptedException e){
		}
		
	}
	
}