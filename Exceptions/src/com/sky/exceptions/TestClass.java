package com.sky.exceptions;


public class TestClass {

	public static void main(String[] args) {

		// Checked
		Class2 obj = new Class2();
		try {
			obj.m2();
		} catch (OddException e1) {
			System.out.println("Odd case");
			e1.printStackTrace();
		} catch (EvenException e2) {
			System.out.println("Even case");
			e2.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		//obj.m2();
		
		// Unchecked

//		try {
//			int[] arr = {1,2,3};
//			System.out.println(arr[2]);
//			System.out.println(arr[3]);
//			System.out.println(arr[2]);
//		} catch(Exception e) {
//			System.out.println("I am from catch block");
//			e.printStackTrace();
//		} finally {
//			System.out.println("I am finally here!");
//		}

		System.out.println("This is the last line");
	}


}

class OddException extends Exception {
	public OddException() {
		super();
	}
	
	public OddException(String s) {
		super(s);
	}
}

class EvenException extends Exception {
	EvenException() {
		super();
	}
	
	EvenException(String s) {
		super(s);
	}
}



class Class2 {
	public void m1() throws OddException, EvenException  {
		
		int x = 19;
		
		if (x%2 == 0) {
			throw new EvenException();
		} else {
			throw new OddException("ODDDDD CASEEEEEE");
		}
		
	}
	
	public void m2() throws OddException, EvenException {
		m1();
	}
	
}