package com.example.statement;
/*
 * A prepared statement will protect against sql injection since it compiles the
 * 		statement before sending it over. This type of execution is known as 
 * 		sanitization. It will sanitize the input to make sure there is nothing
 * 		that will unintentionally harm the data in our database.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.config.ConnectionUtil;
import com.example.model.TableName;

public class PreparedStatementExample {

	
	public List<String> selectWhere(String where){
		Connection conn;
		List<String> list = new LinkedList<>();
		try {
			conn = ConnectionUtil.getInstance().getConnection();
			String sql = "select username from table_name where password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, where);
			ResultSet rs = ps.executeQuery();
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
	
	public int insert(TableName t) {
		Connection conn;
		int resultCount=-1;
		try {
			conn = ConnectionUtil.getInstance().getConnection();
			String sql = "insert into table_name values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getId());
			ps.setString(2, t.getUsername());
			ps.setString(3, t.getPassword());
			ps.setInt(4, t.getAge());
			resultCount = ps.executeUpdate();
			ps.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultCount;
	}
}
