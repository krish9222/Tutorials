package com.sky.progs;

public class StackAllZerosToExtremeEnds {

	static int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
	
	public static void main(String[] args) {
//		stackTowardsFarRightWithoutNewArray();
//		stackTowardsFarLeftWithoutNewArray();
		
//		stackTowardsFarRightWithNewArray();
//		stackTowardsFarLeftWithNewArray();
	}
	
	static void stackTowardsFarRightWithoutNewArray() {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				
				arr[count] = arr[i];
				
				count = count + 1;
				
			}
		}

		while(count < arr.length) {
			
			arr[count] = 0;
			
			count = count + 1;
			
		}
		
		printArr();
	}
	
	static void stackTowardsFarRightWithNewArray() {
		
		int[] newArr = new int[arr.length];
		
		int j = 0;
		
		for (int i=0; i < arr.length-1; i++) {
			
			if (arr[i] != 0) {
				
				newArr[j++] = arr[i];
				
			}
		}
		
		
		// Print array
		for (int i : newArr) {
			System.out.println(i);
		}
	}
	
	static void stackTowardsFarLeftWithoutNewArray() {
		
		int count = arr.length -1 ;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			
			if(arr[i] != 0) {
				
				arr[count--] = arr[i];
				
			}
			
		}
		
		while(count >= 0) {
			
			arr[count--] = 0;
			
		}
		
		printArr();
	}
	
	static void stackTowardsFarLeftWithNewArray() {
		
		int[] newArr = new int[arr.length];
		
		int j = arr.length-1;
		
		for (int i=arr.length-1; i >= 0; i--) {
			
			if (arr[i] != 0) {
				
				newArr[j--] = arr[i];
				
			}
		}
		
		// Print array
		for (int i : newArr) {
			System.out.println(i);
		}
		
	}
	
	static void printArr() {
		
		for (int in : arr) {
			
			System.out.println(in);
			
		}
	}

}
