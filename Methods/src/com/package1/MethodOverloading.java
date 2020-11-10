package com.package1;

public class MethodOverloading {

	public static void main(String[] args) {
		add(3, 5);
		add(2.5, 2.5);
		add(3, 3, 5);
		add(3, 2.5);
	}
	
	
	public static void add(int para1, int para2) {
		System.out.println(para1 + para2);
	}
	
	public static void add(int para1, int para2, int para3) {
		System.out.println(para1 + para2 + para3);
	}
	
	public static void add(int para1, double para2) {
		System.out.println(para1 + para2);
	}
	
	public static void add(int para1, double para2, double para3) {
		System.out.println(para1 + para2);
	}

	
	public static void add(double para1, double para2) {
		System.out.println(para1 + para2);
	}
	

}
