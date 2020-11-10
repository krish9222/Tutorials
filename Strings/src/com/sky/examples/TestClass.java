package com.sky.examples;

public class TestClass {
	
	static String var1 = new String("FirstName");
	static String var3 = new String("FirstName");
	static String var4 = new String("Firstname");
	static String var5 = "FirstName";
	static String var7 = "Firstname";
	static String var6 = var1;
	
	static StringBuffer v1 = new StringBuffer("FirstName");
	static StringBuilder v2 = new StringBuilder("FirstName");	

	public static void main(String[] args) {	
//		System.out.println(v1.length());
//		System.out.println(var1.startsWith("First"));
		
//		System.out.println(var1);
//		System.out.println(var2);
//		
//		var1 = var1.concat(" LastName");
//		var2.append(" LastName");
//
//		System.out.println(var1);
//		System.out.println(var2);

		// .equals
//		System.out.println(var1.equals(var3));
//		System.out.println(var1.equals(var4));
//		System.out.println(var3.equals(var4));
		// ==
//		System.out.println(var1 == var3);
//		System.out.println(var1 == var4);
//		System.out.println(var3 == var4);
//		System.out.println(var1 == var5);
//		System.out.println(var1 == var6);
		// .compareTo
//		System.out.println("HELLO".compareTo("HELLP"));
//		System.out.println("z".codePointAt(0));
		
		
		
		String str = "What We think, We Become!";
//		
//		
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
//		
//		System.out.println(str.toCharArray());
//		
//		System.out.println(str.charAt(13));
//		
//		System.out.println(str.concat(" - Buddha"));
//		
//		System.out.println(str.contains(","));
//		
//		System.out.println(str.endsWith("!"));
//		System.out.println(str.startsWith("What"));
//		
//		System.out.println(str.indexOf("We"));
//		System.out.println(str.indexOf("We", 7));
//		System.out.println(str.lastIndexOf("We"));
//		
//		System.out.println(str.length());
//		
//		System.out.println(str.replace("We", "I"));
//		System.out.println(str.replaceFirst("We", "I"));
//		
//		System.out.println(str.substring(5));
//		System.out.println(str.substring(5, 7));
//		
		String[] arr = str.split(",");
		System.out.println(str.split(","));
//		System.out.println(str.split(",")[0]);
//		System.out.println(str.split(",")[1]);
				
		
	}

}
