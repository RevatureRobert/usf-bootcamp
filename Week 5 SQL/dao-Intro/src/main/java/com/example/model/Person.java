package com.example.model;

public class Person {

	private int ssn;
	private String firstname;
	private String lastname;
	private Address address;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ "]";
	}

	public Person(int ssn, String firstname, String lastname, Address address) {
		super();
		this.ssn = ssn;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
