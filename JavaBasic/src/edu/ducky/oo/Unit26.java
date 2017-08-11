package edu.ducky.oo;

public class Unit26 {
	
}

interface Document {
	void show();
}

interface ReferentDoc extends Document {
	
}

class Book implements Document {
	public void show() {
		
	}
}

class ReferentBook extends Book implements Document, ReferentDoc {
	// Class chỉ có đơn thừa kế
	// Interface có đa thừa kế
}

