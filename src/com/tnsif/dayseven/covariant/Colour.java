package com.tnsif.dayseven.covariant;

public class Colour {
	protected Colour getColour() {
		Colour s =new Colour(); 
		return s;
		
	}
}

class Red extends Colour{
	protected Colour getColour() {
		Red s = new Red();
		return s;
	}
}

class Green extends Colour{
	protected Colour getColour() {
		Green s = new Green();
		return s;
	}
}


