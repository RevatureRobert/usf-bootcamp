package com.company.firstclass;

//import java.util.Arrays;

import static java.util.Arrays.sort;

public class CarMain {
	
	public static void main(String[] args) {
		int x = 5;
		Car carA = new Car();
		carA.speed = 55.0;
		carA.printSpeed(); // 55.0
		
		Car carB = new Car();
		carB.speed=70;
		carB.printSpeed(); // 70
		carA.printSpeed(); // 70
		
		
		int[] arr = {1,2,3}; 
//		java.util.Arrays.sort(arr); // this is the fully qualified name
		
//		Arrays.sort(arr); // this is the shortened version if using an import statement
		
		sort(arr); // this is if using the static import
	}
}
