package com.company.generics;

public class GenericExample<T> {
	
	public T makeIt(T t) {
		return t;
	}
	
	public static void main(String[] args) {
		GenericExample<String> ge = new GenericExample<>();
		ge.makeIt("this thing");
	}

}
