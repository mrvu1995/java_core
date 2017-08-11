package edu.ducky.basic;

public class ArrDemo {
	public static void main(String [] args) {
		int [][] arrArr = new int[5][6];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(arrArr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
