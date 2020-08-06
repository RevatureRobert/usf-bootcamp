package com.company.algorithms;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(power(2, 2));
		System.out.println(power(3,4));
	}

	static long power(int start, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return start * power(start, exponent - 1);
		}
	}
}
/*
 * power(2,2) 
 * 		2 * power(2,1) 
 * 			2 * power(2,0) 
 * 				1 
 * 			2*1==2 
 * 		2*2==4 
 * 4
 * 
 * 
 */
