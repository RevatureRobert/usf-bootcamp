package com.example.statement;
/*
 * A Statement will not protect from sql injection. It will take in 
 * 		a string as the sql statement and send it directly over to 
 * 		the db for execution and compilation.
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.example.config.ConnectionUtil;

public class SimpleStatementExample {

	public List<String> selectTableName(){
		Connection conn;
		List<String> list = new LinkedList<>();
		try {
			conn = ConnectionUtil.getInstance().getConnection();
			Statement s = conn.createStatement();
			String sql = "select username from table_name";
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString("username"));
			}
			s.close();
			rs.close();
			conn.close();
		} catch(SQLException s) {
			s.printStackTrace();
		} finally {
		}
		return list;
	}
	
	public List<String> selectWhere(String where){
		Connection conn;
		List<String> list = new LinkedList<>();
		try {
			conn = ConnectionUtil.getInstance().getConnection();
			String sql = "select username from table_name where password = "+where;
			Statement ps = conn.createStatement();
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString(1));
			}
			conn.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
