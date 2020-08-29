package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.config.ConnectionUtil;
import com.example.model.Address;
import com.example.model.Person;

public class PersonDao implements DaoContract<Person, Integer> {

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findById(Integer i) {
		Person p = new Person();
		try {
			Connection conn = ConnectionUtil.getInstance().getConnection();
			String sql = "select * from person full outer join address on person.address = address.id where person.ssn = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, i);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				p.setSsn(rs.getInt(1));
				p.setFirstname(rs.getString(2));
				p.setLastname(rs.getString("lastname"));
				p.setAddress(
						new Address(
								rs.getInt("id"), 
								rs.getString("line1"), 
								rs.getString("line2"),
								rs.getString("city"), 
								rs.getString("state"), 
								rs.getInt("zipcode")));
				
			}
			conn.close();
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public Person delete(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person update(Person t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person insert(Person t) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
