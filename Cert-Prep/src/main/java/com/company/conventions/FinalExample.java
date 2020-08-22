package com.company.conventions;

/*
 *  the final keyword:
 *  		on a class					cant extend it
 *  		on a method					cant override it
 *  		on a field					cant change it
 *  		
*/
public class FinalExample {

	public void print(String s) {
		System.out.println(s);
	}
	
	public int something=8;
}

class newExample{
	public static final FinalExample fe = new FinalExample();
}

class MainDriver{
	public static void main(String[] args) {
		newExample.fe.something=10;
	}
}