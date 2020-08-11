package com.company.oop.inheritance;

/*
 * 	While Inheritance describes an is-a relationship 
 * 		(A Dog is-a Animal), Composition describes 
 * 		a has-a relationship (A Dog has-a collar)
 */
public class Composition {

	private Animal pet;
	
	public static void main(String[] args) {
		Composition c = new Composition();
		c.pet= new Dog();
		c.pet.makeSound();
	}
}
