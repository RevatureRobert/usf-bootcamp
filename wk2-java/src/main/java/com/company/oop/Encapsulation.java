package com.company.oop;

public class Encapsulation {

	// restrict direct access with access modifiers
	private int age;
	
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	// make the value accessible
	public int getAge() {
		return this.age;
	}
	
	// make the value changeable
	private void setAge(int a) {
		this.age = a;
	}
	
	public void haveBirthday() {
		this.setAge(this.age+1);
	}
}


class mainMethod {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
//		e.age=-44;
//		e.age=79;
		System.out.println(e.getAge());
		e.haveBirthday();
		e.haveBirthday();
		System.out.println(e.getAge());
	}
}