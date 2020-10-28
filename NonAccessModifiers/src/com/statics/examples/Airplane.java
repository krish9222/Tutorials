package com.statics.examples;

public class Airplane {
	
	boolean inAir = false;
	
	public void takeOff() {
		if(!inAir) {
			Airport.totalTakeOffs++;
			inAir = true;	
		}
	}
	
	public void touchDown() {
		if (inAir) {
			Airport.totalTouchDowns++;
			inAir = false;	
		}
	}
}
