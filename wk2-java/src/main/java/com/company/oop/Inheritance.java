package com.company.oop;

public class Inheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound();
		
	}
}









class Animal extends Object {
	public void makeSound() {
		System.out.println("animal noises");
	}
	
	Animal(){
		super();
		System.out.println("Animal constructor");
	}
}













class Dog extends Animal{
	
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
	
	
	
	
	
}