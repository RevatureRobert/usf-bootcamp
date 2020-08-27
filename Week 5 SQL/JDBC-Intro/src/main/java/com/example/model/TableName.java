package com.example.model;

public class TableName {

	private int id;
	private String username;
	private String password;
	private int age;

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TableName [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + "]";
	}

	public TableName(int id, String username, String password, int age) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public TableName() {
		super();
		// TODO Auto-generated constructor stub
	}

}
