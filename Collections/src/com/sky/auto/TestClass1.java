package com.sky.auto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Queue;

public class TestClass1 {

	public static void main(String[] args) {
		
		/* String[] strArray = new String[10];
		strArray[0] = "Hi";
		strArray[0] = null;
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		
		int[] intArray = {0,1,2};
		intArray[2] = 3;
		System.out.println(intArray[2]);
		///
		
		List<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Hi0");
		myArrayList.add("Hi2");
		myArrayList.add("Hi3");
		myArrayList.add("Hi4");
		myArrayList.add("Hi5");
		
		System.out.println(myArrayList.get(0));
		
		for (String t : myArrayList) {
			System.out.println(t);
		}
		
		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println(myArrayList.get(i));
		} 
		
		List<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Hi");
		arrayList1.add("Hello");
		arrayList1.add("Hi");
		arrayList1.add(null);
		
		arrayList1.forEach(value -> System.out.println(value)); */
		
		// Set
		/* Set<String> set1 = new HashSet<String>();
		
		set1.add("Hi");
		set1.add("Hello");
		set1.add("Hiiiii");
		
		
		Iterator<String> itr = set1.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		
		set1.forEach(value -> {
			System.out.println(value);
		}); */
		
		
		// Maps
		/* Map<Integer, String> myMap1 = new HashMap<Integer, String>();
		myMap1.put(101, "P1");
		myMap1.put(102, "P4");
		myMap1.put(103, "P6");
		myMap1.put(104, "P1");
		
		System.out.println(myMap1.size());
		System.out.println(myMap1.get(104));
		System.out.println(myMap1.containsKey(103));
		System.out.println(myMap1.containsValue("p9"));
		
		Iterator<Integer>  keySetItr = myMap1.keySet().iterator();
		while(keySetItr.hasNext()) {
			System.out.println(keySetItr.next());
		}		
		
		Set<Entry<Integer, String>> str = myMap1.entrySet();
		Iterator<Entry<Integer, String>> itr = str.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		} */
		
		
		
	}

}
