package com.company.oop.inheritance;

public class Animal extends Object {
	public void makeSound() {
		System.out.println("animal noises");
	}
	
	Animal(){
		super();
		System.out.println("Animal constructor");
	}
}
