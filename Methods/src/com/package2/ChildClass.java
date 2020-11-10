package com.package2;

import com.package1.ParentCalss;

public class ChildClass extends ParentCalss {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		
		System.out.println(obj.apartments);
		System.out.println(obj.cars);
		obj.earnMoney();
	}
	
	public void earnMoney() {
		System.out.println("I am CEO");
	}

}
