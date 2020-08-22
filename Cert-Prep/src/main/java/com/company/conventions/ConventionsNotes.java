package com.company.conventions;

public class ConventionsNotes {

	/*
	 * there are certain conventions with naming in java:
	 * 	
	 * 		class 		->	 noun 		->	 TitleCase
	 * 		method 		->   verb		->	 camelCase
	 * 		interfaces	->	 adjectives	-> 	 TitleCase
	 * 		packages	-> 	 nouns		-> 	 lowercase
	 * 		variables	->	 nouns		-> 	 camelCase
	 * 
	 * 
	 * 		reserved java keywords
	 * 			for		while		do		final		abstract		transient
	 * 			synchronized		var		and more...
	 * 
	 * 
	 * 		&&		||		? :
	 * 
	 * 
	*/
	
	public static void main(String[] args) {
		int input = 8;
		int output = 0;
//		if(input>10) {
//			output = 10;
//		} else {
//			output = input;
//		}
		
		// ternary operator
		output = input>10? 10 : input;
		System.out.println(output);
	}
}
