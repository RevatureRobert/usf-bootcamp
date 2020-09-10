package com.legit.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.legit.config.ConnectionUtil;
import com.legit.model.User;

public class UserDao implements DaoContract<User, Integer>{

	public List<User> findAll() {
		List<User> users = new LinkedList<>();
		try(Connection conn = ConnectionUtil.getInstance().getConnection()){
			String sql = "select * from boot_user";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				users.add(new User(rs.getInt("id"), rs.getString("username"), rs.getString("password")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public User findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int create(User t) {
		int result=-1;
		try(Connection conn = ConnectionUtil.getInstance().getConnection()){
			String sql = "insert into boot_user (username, password) values (?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getUsername());
			ps.setString(2, t.getPassword());
			result = ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public User delete(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User findByUsername(String username) {
		return null;
	}

}
