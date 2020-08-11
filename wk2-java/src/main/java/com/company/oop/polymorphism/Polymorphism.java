package com.company.oop.polymorphism;

public class Polymorphism {

	
	public static void main(String[] args) {
		BadPainter bp = new BadPainter();
//		bp.paint();
		
		Painter p = bp; // implicit up cast
//		p.paint();
		
		Painter p1 = new Painter();
		
//		BadPainter bp1 = (BadPainter)p1; // down casting has to explicit
		
//		((BadPainter)p1).paint(); // calling a method with explicit down cast
		
		((Painter)bp).paint(); // explicit up cast
	}
}


