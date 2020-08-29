package com.example.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.model.Person;

public class PersonDaoTest {

	PersonDao pd;
	
	@BeforeEach
	public void setup() {
		pd = new PersonDao();
	}
	
	@Test
	public void findByIdTest1() {
		Person p = pd.findById(1);
		assertNotNull(p);
		assertEquals(1, p.getSsn());
	}
	
	@Test
	public void findByIdTest2() {
		Person p = pd.findById(3);
		System.out.println(p);
		assertNotNull(p);
		assertEquals(3, p.getSsn());
	}
	
	@Test
	public void findByIdTest3() {
		Person p = pd.findById(55);
		assertNotNull(p);
		assertNull(p.getAddress());
	}
}
