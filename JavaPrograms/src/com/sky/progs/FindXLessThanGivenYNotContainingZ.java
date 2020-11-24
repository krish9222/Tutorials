package com.sky.progs;

/**
 * 
 * Write a java program to find the largest number L less than a given number N which should not contain a given digit D.
 * 
 * For example, If 155 is the given number and 5 is the given digit, then you should find the largest number less than 155 such that it should not contain 5 in it. In this case, 149 will be the answer.
 * 
 * Input for program:
 * System.out.println(nearestDesiredNumber(123, 2));
 * System.out.println(nearestDesiredNumber(4582, 5));
 * System.out.println(nearestDesiredNumber(98512, 5));
 * System.out.println(nearestDesiredNumber(548624, 8));
 * 
 * Output of the program:
 * 
 * 119
 * 4499
 * 98499
 * 547999
 * 
 * Hint: We can convert an integer to String by using Integer.toString() method.
 * 
 *
 */
public class FindXLessThanGivenYNotContainingZ {

	public static void main(String[] args) {
		
		System.out.println(find(155, 1));;

	}
	
	static int find(int givenNumber, int notContainingDigit) {
		
		char ch = Integer.toString(notContainingDigit).charAt(0);
		
		if(givenNumber > 0) {
			
			for (int i = givenNumber-1; i >= 0; i--) {
				
				
				if (Integer.toString(i).indexOf(ch) == -1) {
					return i;
				}
				
			}
			
		}
		
		return -1;
	}

}
