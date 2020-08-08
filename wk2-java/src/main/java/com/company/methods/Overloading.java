package com.company.methods;
/*
 * method overloading is the act of declaring different methods
 * 		with the same name, but different parameters. We can 
 * 		achieve overloading by:
 * 
 * 			change the number of parameters
 * 			change the type of parameters
 * 			change the order of parameters
 * 
 */
public class Overloading {

	void print() {
		System.out.println("printing");
	}
	
	// change the number
	String print(String s) {
		return s;
	}
	
	// change the type
	String print(int x) {
		return ""+x;
	}
	
	// change the number
	String print(String s, int x) {
		return s+x;
	}
	
	// change the order
	void print(int x, String s) {
		System.out.println(s+x);
	}
	
}
