package com.company.collection;

import java.util.Stack;

public class StackExample extends Stack<Integer>{

	int[] stack;
	
	StackExample(int size){
		stack = new int[size];
	}
	
	StackExample() {
		this(10);
	}
	
	// get the last element in the array
	@Override
	public synchronized Integer pop() {
		int last = 0;
//		for(int i = stack.length-1; i>=0; i--) {
//			last = stack[i];
//			stack[i]=0;
//		}
		return last;
	}
	
	// add an element to the array
	@Override
	public synchronized boolean add(Integer e) {
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		StackExample se = new StackExample();
		int place = 0;
		for(int i = 10; i<20; i++) {
			se.stack[place]=i;
			place++;
		}
		
		System.out.println(se.pop());
	}
}
