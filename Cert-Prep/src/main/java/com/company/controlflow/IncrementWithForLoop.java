package com.company.controlflow;

public class IncrementWithForLoop {

	
	public static void main(String[] args) {
		for(int i = 0, j = 0; i<10; ++i, j++) {
			System.out.println(i);
			System.out.println(j);
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
	}
	
}
