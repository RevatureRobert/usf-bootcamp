package com.company.message;

public class Controlling {
	public static void main (String[] args) {
//		System.out.println("hey there. im mr meeseesks");
//		int a = 1;
//		System.out.println(a++);
		
		
//		// my dog ran away
//		boolean dogGone = true;
//		while(dogGone) {
//			System.out.println("the dog is gone");
//		}
		
		
		// control flow
		
		// while logging in to the system, timmy is 12 but the minimum age 
		//	requirement is 18. How can we verify his age and not let him log in?
		int timmyAge =12;
		int minAge = 18;
		
		//	we can use an if statement to check his age
		if(timmyAge<=minAge) {
			System.out.println("timmy is too young");
		}
		
		// jennifer is going swimming, there are 3 levels to the pool, 3,4,5 feet.
		//  she cannot swim in the five foot range, needs help in the 4 foot range,
		//  but is fine in the 3 foot range. how can we determine if she is able to swim.
		
		int poolRange = 5;
		int minrange = 3;
				if(poolRange>=minrange) {
					System.out.println("jennifer cannot swim");
				}
		
				
				// if else; if else if else
//		int depth = 2;
//		if(depth == 3) {
//			System.out.println("jennifer can swim");
//		} else {
//			System.out.println("jennifer cannot swim alone");
//		}
		
//		if(depth == 3) {
//			System.out.println("jennifer can swim");
//		} else if(depth==4){
//			System.out.println("jennifer cannot swim alone");
//		} else {
//			System.out.println("jennifer CANNOT go there. keep her safe!!!!!!!!!!!");
//		}
		System.out.println(canSwim(3));
		
		//for loop will run for a specified amount of iterations
		for(/*initializer*/ int i = 0; /*condition*/ i<10; /*incrementer*/i++) {
			System.out.println(i);
		}
		
		// while loop will run while something is true
		while(true) {
			System.out.println("true");
			break;
		}
		
		//do while loop will run while something is true but is guranteed to run at least once
		do {
			System.out.println("do while loop");
		} while(false);
		
		
		int x = 5;
		do {
			x++;
			System.out.println(x);
		} while(x<4);
		
		
	}

	static String canSwim(int depth) {
		if(depth == 3) {
			return "jennifer can swim";
		} else if(depth==4){
			return "jennifer cannot swim alone";
		} else {
			return "jennifer CANNOT go there. keep her safe!!!!!!!!!!!";
		}
	}
	
	static String canSwim2(int depth) {
		switch(depth) {
		case 1:
			return "jennifer could walk in this";
		case 2:
			return "jennifer is getting ready to swim";
		case 3: 
			return "jennifer can swim";
		default:
			return "jennifer should reevaluate her life";	
		}
	}
	
	
	
	
}
