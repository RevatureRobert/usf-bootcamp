package com.company.accessor;

public class User {

	private String username;
	private String password;
	private int age;
	
	// accessor or getter
	public int getAge() {
		return this.age;
	}
	
	// mutator or setter
	public void setAge(int age) {
		if(age<=0) {
			System.out.println("hey, that isnt right");
		}
		else {
			this.age=age;
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		this.password=pass;
	}

	public User(String username, String password, int age) {
		super();
		this.username = username;
		this.password = password;
		setAge(age);
	}
	
	
	
	
}
