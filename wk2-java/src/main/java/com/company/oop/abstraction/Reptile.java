package com.company.oop.abstraction;
/*
 * abstract class can have everything a normal
 * 		class can, it can also have abstract 
 * 		methods. Abstract classes are meant
 * 		to start the hierarchy tree. 
 */
public abstract class Reptile {

	protected double length;
	
	protected void makeSound() {
		System.out.println("some kind of reptile sounds");
	}
	
	abstract int move();
}
