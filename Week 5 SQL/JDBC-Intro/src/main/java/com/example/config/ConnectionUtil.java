package com.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private String url="jdbc:postgresql://personal-pg.czxlfsyznyrj.us-east-2.rds.amazonaws.com:5432/postgres?current-schema=public";
	private String username="jdbc_user";
	private String password="wasspord";
	private static ConnectionUtil c;
	
	private ConnectionUtil() {
		super();
	}
	
	public static ConnectionUtil getInstance() {
		if(c == null) {
			c = new ConnectionUtil();
		}
		return c;
	}
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
}
