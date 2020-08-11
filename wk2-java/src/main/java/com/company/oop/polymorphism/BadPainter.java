package com.company.oop.polymorphism;

/*
 * There are rules to overriding. Overriding is where we change
 * 		the implementation (body of the method) of an inherited 
 * 		method. We can change:
 * 			the access modifier (must be more accessible: protected -> public)
 * 			The return type (we can return a child class of the parent's method
 * 				return type, but not a parent class.) This is known as
 * 				covariance (covariant return types)
 * 			the throws declaration (the child's method must throw a subset of
 * 				the exceptions that the parent's does, including none at all).
 */
public class BadPainter extends Painter{
	@Override // this is an annotation. It tells 
				// the compiler and the developers something about the code
	public Painter paint() {
		System.out.println("painting a wall badly");
		return null;
	}
}
