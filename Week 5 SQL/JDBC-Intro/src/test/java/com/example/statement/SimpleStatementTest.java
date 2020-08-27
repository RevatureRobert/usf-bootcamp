package com.example.statement;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleStatementTest {

	SimpleStatementExample s;
	
	@BeforeEach
	public void setup() {
		s = new SimpleStatementExample();
	}
	
	@Test
	public void testSelectTableName() {
		List<String> list = s.selectTableName();
		assertNotEquals(0, list.size());
		System.out.println(list); 
		
	}
	/*
	 * @Test public void sqlITest() {
	 * s.selectWhere("''; truncate table table_name;--"); }
	 */
}
