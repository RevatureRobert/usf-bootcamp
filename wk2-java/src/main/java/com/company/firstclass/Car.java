package com.company.firstclass;

/*
 * A class is a blueprint for an object. We 
 * 		can make multiple objects (instances)
 * 		off a class using the constructor.
 * 
 * A constructor is a special method within a 
 * 		class to construct instances. It has
 * 		the same name as the class and has
 * 		no return type. 
 * 
 * There is also a difference between instance and
 * 		static fields and methods (states and behaviors)
 * 		where static means that something belongs to the
 * 		class and instance belongs to the object.
 * 
 * You can reference a static field or method from within 
 * 		the instance context but you cannot reference an
 * 		instance field or method from within a static 
 * 		context.
 * 
 * When calling something static, you can just use the class
 * 		name. When calling something off an instance,
 * 		you need to create an object.
 */
public class Car {
	
	static int wheels = 4;

	String engine = "decent";
	double speed; // make this static and watch the mistakes happen
	boolean gasPowered;
	
	void printSpeed() { // make this static also and take out the "this" keyword
		System.out.print("the car is going: ");
		System.out.print(this.speed);
		System.out.println("mph");
	}
	
	Car(){
		System.out.println("constructor called");
	}
	
	static void printWheels() {
		System.out.print("the number of wheels on our cars are: ");
		System.out.println(wheels);
	}
}
