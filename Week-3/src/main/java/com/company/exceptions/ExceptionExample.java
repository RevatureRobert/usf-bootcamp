package com.company.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		// this is a runtime exception (ArithmeticException), we do not have 
		//		to handle it the same way as normal exceptions
		int a = 10;
		int b = 0;
//		System.out.println(a/b);
		
		// Exception is a normal (non-runtime) exception. we have to handle
		//		it or duck responsibility with the throws declaration. we
		//		handle it directly with a try catch block
		try {
			go();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("I will always print");
		}
	}

	public static void go() throws Exception {
		throw new TransferException();
	}
}
