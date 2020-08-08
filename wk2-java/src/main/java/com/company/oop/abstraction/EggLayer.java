package com.company.oop.abstraction;

/*
 * An interface is meant to be a contract
 * 		for a piece of functionality.
 * 
 * interfaces have implicit modifiers:
 * 		methods are public and abstract
 * 		fields are public static and final
 */
public interface EggLayer {
	
	/*public static final*/ int MAX_EGGS = 5;

	/*public abstract*/ int layEggs(); // abstract method
}
