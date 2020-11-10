package com.sky.progs;

import java.util.Map;
import java.util.HashMap;

public class CountNoOfWordsInAString {
	
	static String str = "Hi Hi Hello Hi Hello Bye Hola Hello Hola Hi";

	public static void main(String[] args) {
			
		String[] arr = str.split(" ");
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			String key = arr[i];
			
			//System.out.println(key);
			
			if (myMap.containsKey(key)) {
				
				int val = myMap.get(key);
				
				myMap.put(key, val +1);
				
			} else {
				
				myMap.put(key, 1);
				
			}
			
		}
		
		System.out.println(myMap);
		
		// Output: {Hi:3, Hello:2, Hola:1}
		

	}

}
