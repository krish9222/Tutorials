package com.sky.progs;

public class ReverseString {

	static String str = "Hi, How are you doing 2day ?";

	public static void main(String[] args) {

		method1();
		method2();
		method3();
		method4();
		reverseWordsOnly();

	}

	// str.toCharArray();
	static void method1() {
		String outputStr = "";

		char[] arr = str.toCharArray();

		for (int i = arr.length-1; i >= 0; i=i-1) {

			char letter = arr[i];

			outputStr = outputStr + letter;

			//System.out.print(arr[i]);
		}

		System.out.println("------------- From Method 1 -------------");
		System.out.println(outputStr);
	}

	// str.split("");
	static void method2() {
		String outputStr = "";

		String[] arr = str.split("");

		for (int i = arr.length-1; i >= 0; i=i-1) {

			String letter = arr[i];

			outputStr = outputStr + letter;

		}
		System.out.println("------------- From Method 2 -------------");
		System.out.println(outputStr);
	}

	// str.charAt(i);
	static void method3() {
		String outputStr = "";

		for (int i = str.length()-1; i >= 0; i=i-1) {

			char letter = str.charAt(i);

			outputStr = outputStr + letter;

		}

		System.out.println("------------- From Method 3 -------------");
		System.out.println(outputStr);
	}
	
	// new StringBuilder(str).reverse();
	static void method4() {
		
		StringBuilder sb = new StringBuilder(str);
		
		StringBuilder outputString = sb.reverse();
		
		System.out.println("------------- From Method 4 -------------");		
		System.out.println(outputString);
	}
	
	static void reverseWordsOnly() {
		String[] arr = str.split(" ");
		String outputStr = "";

		for (int i = 0; i < arr.length; i++) {
			
			String word = arr[i];
			
			for (int j = word.length()-1; j >= 0; j--) {
				
				char letter = word.charAt(j);

				outputStr = outputStr + letter;
				
			}
			outputStr = outputStr + " ";
		}
		System.out.println("------------- From reverseWordsOnly -------------");
		System.out.println(outputStr);
		
	}
	
	
}

//Output: ? yadot gniod uoy era woH ,iH


// iH woH era uoy gniod yadot

