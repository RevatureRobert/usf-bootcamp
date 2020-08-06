package com.company.methods;
/*
 * methods have a basic signature:
 * 
 * 	[access modifier] [non-access modifier] [return type (required)] [method name (req)] ([parameters]){
 * 
 *  }
 *  */
public class MethodDiscovery {
	
	public static int add(int x, int y) { // declaring a method with parameters
		int sum = x+y;
		return sum;
	}
	
	public static char returnR() {
		return 'R';
	}
	
	public static void print(String p) {
		System.out.println(p);
	}
	
	public static String returnString(String s) {
		return s;
	}
	
	public static void main(String[] args) {
		MethodDiscovery.add(5, 4); // calling or invoking a method with arguments
//		MethodDiscovery.add(5);
		
		int x = 5;
		x *=4;
		x*=3;
		x*=2;
		x*=1;
		System.out.println(x);
		
		int y = 10;
		y*=9;
		y*=8;
		y*=7;
		y*=6;
		
		
	}

}
