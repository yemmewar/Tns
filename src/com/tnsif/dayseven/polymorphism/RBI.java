package com.tnsif.dayseven.polymorphism;

public class RBI {
	public float getRateofInterest() {
		return 7.1f;
		
	}

}
class Axis extends RBI{
	public float getRateofInterest() {
		return 6.6f;
	}
}
class ICICI extends RBI{
	public float getRateofInterest() {
		return 5.6f;
	}
}
class I extends RBI{
	public float getRateofInterest() {
		return 5.6f;
	}
}