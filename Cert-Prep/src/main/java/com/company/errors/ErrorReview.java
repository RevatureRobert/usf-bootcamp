package com.company.errors;

import com.company.conventions.FinalExample;

public class ErrorReview {

	
	public static void main(String[] args) {
//		throw new Exception();									// compilation error
//		throw new ArrayIndexOutOfBoundsException();				// runtime exception
//		throw new StackOverflowError();							// runtime error
//		throw new OutOfMemoryError();							// runtime error
		
//		// what is the output
//		int e = 0;
//		int[] arr = new int[1];
//		arr[e]=4;
//		e++;
//		arr[e] = 7;
//		System.out.println(arr[0]);
		
		// 4
		// 7
		// 0
		// runtime exception
		// compilation error
		
		FinalExample f = new FinalExample();
		f.something=9;
		f.something=99;
		System.out.println(f.something);
	}
}
