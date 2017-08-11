package edu.ducky.oo;

public class Unit30 {
	public static void main(String [] args) {
		String test = "StudyAndShare";
		try {
			System.out.println("Before");
			System.out.println(test.substring(50));
			int a = 0;
			int b = 0;
			System.out.println("a/b: " + a/b);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.toString());
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.toString());
		}
		System.out.println("After");
	}
}
