package com.company.generics;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GenericExampleTest {

	GenericExample<String> sge = new GenericExample<>();
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("this is before all the test cases");
	}
	
	@Before
	public void before() {
		System.out.println("this is before each test case");
	}
	
	@After
	public void after() {
		System.out.println("this is after each test case");
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("this is after all test cases");
	}
	
	@Test
	public void testString() {
		assertEquals("our testing string", sge.makeIt("our testing string"));
	}
}
