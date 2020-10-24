package com.statics.examples;

// Example 1: static method main is accessing static variables without object

public class StaticMethodExample1 {

	static int i = 10;
	static String s = "Beginnersbook";
	//This is a static method
	public static void main(String args[]) 
	{
		System.out.println("i:"+i);
		System.out.println("s:"+s);
	}

}
