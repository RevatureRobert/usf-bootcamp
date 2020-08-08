package com.company.strings;

public class StringExample {

	public static void main(String[] args) {
		String s = "jess";
		// number 1  string concatenation
//		System.out.print("hello this is ");
//		System.out.print(s);
//		System.out.println(" it is nice to meet you");
		
//		System.out.println("hello this is " + s + " it is nice to meet you");
		
		// number 2  String methods
		
//		System.out.println("hello".toUpperCase());
//		System.out.println("world".substring(1, 3));
//		System.out.println("hey".equals("heY"));
		
		// number 3  String equality
		String one = "joy";
		String two = new String("joy");
		
		// == checks memory location
		System.out.print("== : ");
		System.out.println(one == two);
		
		// intern internalizes the String to the String pool
		System.out.print("== with intern :");
		System.out.println(one == two.intern());
		
		// .equals checks actual string value
		System.out.print(".equals : ");
		System.out.println(one.equals(two));
		
		
		
		
		// number 4  String immutability
			// String methods return the altered String, but does not change the 
			//		String the operation was performed on
		
		String s1 = "kickball";
		// no change
		s1.substring(2, 5);
		System.out.println(s1);
		
		// change
		s1 = s1.concat(" is fun");
		System.out.println(s1);
	}
	
	
	

}
