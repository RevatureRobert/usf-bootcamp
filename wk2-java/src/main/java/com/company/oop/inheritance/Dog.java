package com.company.oop.inheritance;

public class Dog extends Animal{
	
	String name;
	
	Dog(){
		super();
		System.out.println("dog constructor");
	}
	
	Dog(String s){
		super();
		System.out.println("dog string constructor called");
		this.name=s;
	}
	
	public void makeSound() {
		System.out.println("dog noises");
	}
	
	
	
	
	
}