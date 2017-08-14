package edu.ducky.oo;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Unit36 {
    public static void main(String[] args) {
        
    }
	public int increase(int a) {
		return a + 7;
	}
	
	public Unit35 create() throws FileNotFoundException {
		return new Unit35();
	}
}

class Tutorial36 {
	public int increase(int a) {
		return a + 5;
	}
	
	public Tutorial35 create() throws IOException {
		return new Tutorial35();
	}
}