package com.company.algorithms;

public class Nesting {

	public static void main(String[] args) {
//		for(int hour = 0; hour <24; hour++) {
//			for(int minute=0; minute<60; minute++) {
//				for(int second=0; second<60; second++) {
//					System.out.print(hour);
//					System.out.print(":");
//					System.out.print(minute);
//					System.out.print(":");
//					System.out.println(second);
//				}
//			}
//		}
		
		
		boolean first = true;
		boolean second = true;
		
		if(first) {
			System.out.println("first is true");
			if(second) {
				System.out.println("second is true");
			}
			else {
				System.out.println("first is true and second is false");
			}
		} else if(second){
			System.out.println("second is true and first is false");
		} else {
			System.out.println("neither is true");
		}
	}
}
