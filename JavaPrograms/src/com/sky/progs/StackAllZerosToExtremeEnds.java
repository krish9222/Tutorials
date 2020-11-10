package com.sky.progs;

public class StackAllZerosToExtremeEnds {

	static int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
	
	public static void main(String[] args) {
		
		stackTowardsFarRight();
		stackTowardsFarLeft();
		
	}
	
	static void stackTowardsFarRight() {
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
	
	static void stackTowardsFarLeft() {
		
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
	
	static void printArr() {
		for (int in : arr) {
			System.out.println(in);	
		}
	}

}
