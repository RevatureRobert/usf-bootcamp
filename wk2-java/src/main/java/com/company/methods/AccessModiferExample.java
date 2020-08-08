package com.company.methods;
/*
 * Access modifiers are keywords associated with methods, fields, and classes
 * 	that change how and where it can be accessed.
 * 
 * 					public		protected		(default)		private
 * 	anywhere			X			O				O				O
 * 	child classes		X			X				O				O
 * 	package				X			X				X				O
 * 	class				X			X				X				X
 * 	
 * 		
 */
public class AccessModiferExample {
	
	public static void paint() { // accessible anywhere
		System.out.println("painting");
	}
	
	protected void print(String s) { // accessible within the same class, child class, or package
		System.out.println(s);
	}
	
	void paint2(String s) { // accessible within the same class and package
		System.out.println(s);
	}
	
	private static void paint3(String s) { // accessible within the same class
		System.out.println(s);
	}

}
