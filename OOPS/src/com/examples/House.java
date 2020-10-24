package com.examples;

// Object House
public class House {
	// States
	public String name;
	private String address;
	protected String color;
	double area;
	
	// Behaviors 
	private void openGate(String para1) {
		System.out.println("Door is opened for " + para1);
	}

	public void closeGate(String para1) {
		System.out.println("Door is closed for " + para1);
	}
	
	protected void paintHouse() {
		System.out.println("Painting the hiouse");
	}
}
