package com.legit.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private String url = System.getenv("app_user_url");
	private String username = System.getenv("app_user_name");
	private String password = System.getenv("app_user_password");
	private static ConnectionUtil instance;
	
	private ConnectionUtil() {}
	
	public ConnectionUtil getInstance() {
		if (instance == null) {
			instance = new ConnectionUtil();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
}
