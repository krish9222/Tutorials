package com.sky.progs;

public class Swap {
	
	static int x = 1;
	static int y = 2;
	
	public static void main(String[] args) {
		method2();
	}
	
	
	static void method1() {

		int tempVariable;	
		
		System.out.println("before: X is " + x);
		System.out.println("before: y is " +y);
		
		tempVariable = x;
		x = y;
		y = tempVariable;
		
		System.out.println("after: X is " +x);
		System.out.println("after: y is " +y);
	}
	
	
	static void method2() {
		System.out.println("before: X is " + x);
		System.out.println("before: y is " +y);
		
		// 3 = 1 + 2
		x = x + y;
		
		// 1 = 3 - 2
		y = x - y;
		
		// 2 = 3 - 1
		x = x - y;
		
		System.out.println("after: X is " +x);
		System.out.println("after: y is " +y);
	}
	
}
