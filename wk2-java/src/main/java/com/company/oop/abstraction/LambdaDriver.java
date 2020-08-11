package com.company.oop.abstraction;

import java.util.function.Predicate;

public class LambdaDriver {

	public static void main(String[] args) {
//			This is an anonymous inner class that will only be made once
//		
//		Reptile r = new Reptile() {
//
//			@Override
//			int move() {
//				// TODO Auto-generated method stub
//				return 0;
//			}};
		
//		EggLayer e = new EggLayer() {
//
//			@Override
//			public int layEggs() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		};
		
//			This is a lambda. a special syntax for creating an anonymous
//				inner class with less typing. It only works for functional 
//				interfaces.
		
		EggLayer e = () -> {
			return 6;
		};
		
		EggLayer e1 = () -> 6;
		
		A a = (String input) -> System.out.println(input);
		a.print("hey its a lambda!!!");
		
		A a1 = in -> System.out.println(in);
		a1.print("inputting into a lambda");
		
		// we are giving the implementation for the interface as the argument
		//	for the method. This will tell the predicate how to act when its 
		//	method is called.
		System.out.println(test((Integer i) -> i<1));
		
	}
	
	public static boolean test(Predicate<Integer> p) {
		return p.test(5);
	}
}

interface A {
	void print(String a);
}