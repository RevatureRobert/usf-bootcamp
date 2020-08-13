package com.company.collection;

import java.util.Stack;

public class StackExample extends Stack<Integer>{

	int[] stack;
	int lastIndex = -1;
	
	StackExample(int size){
		stack = new int[size];
	}
	
	StackExample() {
		this(10);
	}
	
	// get the last element in the array
	@Override
	public synchronized Integer pop() {
		if(lastIndex == -1) {
			return 0;
		} else {
			return stack[lastIndex--];
		}
	}
	
	// add an element to the array
	@Override
	public synchronized boolean add(Integer e) {
		if (lastIndex == stack.length-1) {
			return false;
		} else {
			stack[++lastIndex]=e;
			return true;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		StackExample se = new StackExample();
		int place = 0;
		for(int i = 10; i<20; i++) {
			se.add(i);
		}
		
		System.out.println(se.pop());
		System.out.println(se.pop());
		System.out.println(se.pop());
		System.out.println(se.pop());
		System.out.println(se.pop());
		se.add(44);
		System.out.println(se.pop());
		System.out.println(se.pop());
		
		
		
//		String s = method("hello", "l");
//		System.out.println(s); // -> llohe
	}
}
