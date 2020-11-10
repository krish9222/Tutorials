package com.loops.examples;

public class TestClass {

	static int x = 0;
	static int y = 0;
	
	public static void main(String[] args) {
		// Why we use loops
		
		System.out.println("***************** For Loop *****************");
		// For loops
		for(int z = 0; z < 5 ; z = z + 1) {
			
			if (z%2 == 0) {
				System.out.println(z + " Even");
				continue;
			} else {
				System.out.println(z + " odd");
				
			}
			System.out.println("Value is " + z);
			
		}
		
		/*
		
		// While loops
		System.out.println("***************** While *****************");
		while (x<5) {
			System.out.println("I am printed. X is " + x);
			x = x + 1;
		}

		
		// 0 -> true -> prints -> 1
		// 1 -> true -> prints -> 2
		// 2 -> true -> prints -> 3
		// 3 -> true -> prints -> 4
		// 4 -> true -> prints -> 5
		// 6 -> false ..............................
		
		System.out.println("***************** Do While *****************");
		
		do {
			System.out.println("I am printed. Y is " + y);
			y = y + 1;
		} while(y<5);
		
		
		// prints -> 1
		// 1 -> true -> prints -> 2
		// 2 -> true -> prints -> 3
		// 3 -> true -> prints -> 4
		// 4 -> true -> prints -> 5
		// 5 -> false ....................
		
		
		
		// Conditional statements
		System.out.println("***************** IF *****************");
		int i = 10;
		
		if (i == 9) {
			System.out.println("I am 9");
		} else if (i == 8) {
			System.out.println("I am 8");
		} else if(i == 7) {
			System.out.println("I am 7");
		} else {
			System.out.println("I am " + i);
		}
		
		
		
		System.out.println("***************** Switch *****************");
		
		switch ("Krishna") {
			case "krishna":
				System.out.println("I am krishna");
				break;
				
			case "kiran":
				System.out.println("I am kiran");
				break;
				
			case "sai":
				System.out.println("I am sai");
				break;
	
			default:
				System.out.println("I don't know");
				break;
		}
		
		/////////////
		
		
		*/
		
		
	}

}
