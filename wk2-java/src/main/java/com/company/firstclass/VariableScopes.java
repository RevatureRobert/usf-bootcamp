package com.company.firstclass;
/*
 * In java, we have the scopes of a variable.
	 * There are four in fact: static, instance, method, block.
	 * Its all about where the variable no longer exists.
 */
public class VariableScopes {
	
	static String cat = "static"; // static scope
	
//	String cat = "instance"; instance scope

	public static void main(String[] args) {
//		String cat = "furball"; //method scope
		if(true) {
//			String cat = "whiskers"; //block scope
		}
//		System.out.println(cat);
		
		
//		VariableScopes vs = new VariableScopes();
//		System.out.println(vs.cat);
		
		System.out.println(cat);
	}
}
