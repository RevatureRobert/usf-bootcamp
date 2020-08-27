package com.example.config;

/*
 * jdbc (Java Database Connectivity) is an api in java that allows you to communicate with sql databases.
 * 		We need to get the driver (the postgres dependency in the pom)
 * 		We need to get the information (url, username, password)
 * 		We need to get the connection (DriverManager.getConnection())
 * After that we can send queries to the db and get back results.
 */
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConnectionUtilTest {

	private ConnectionUtil c;
	
	@BeforeEach
	public void setUp() {
		c = ConnectionUtil.getInstance();
	}
	
	@Test
	public void testConnection() throws SQLException {
		assertNotNull(c.getConnection());
	}
}
