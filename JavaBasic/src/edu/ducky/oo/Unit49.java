package edu.ducky.oo;

import java.util.HashMap;

public class Unit49 {
	public static void main(String [] args) {
		HashMap map = new HashMap();
		map.put("instructor", "Ducky");
		map.put("blog", "StudyAndShare");
		map.put(new Integer(5), "VietNam");
		map.put("blog", "Test");
		System.out.println(map.get("instructor"));
		System.out.println(map.size());
		map.remove("instructor");
		System.out.println(map.get("instructor"));
		map.clear();
		System.out.println(map.get("blog"));
	}
}
