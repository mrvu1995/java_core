package edu.ducky.oo;

public class Unit53 {
	public static void main(String [] args) {
		Unit53 unit = new Unit53();
		System.out.println(unit);
		System.out.println(unit.toString());
		Unit52 unit52 = new Unit52();
		StringBuilder builder = new StringBuilder("Ducky");
		System.out.println(builder.toString());
	}
	
	@Override
	public String toString() {
		return "This is an Unit53 object";
	}
}
