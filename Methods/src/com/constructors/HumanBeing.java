package com.constructors;

public class HumanBeing {
	
	public String gender;
	
	HumanBeing() {
		System.out.println("Default Constructor is called!!!!");
	}
	
	HumanBeing(String gender) {
		this.gender = gender;
		System.out.println("My Gender is " + this.gender);
	}

}
