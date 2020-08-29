package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.config.ConnectionUtil;
import com.example.model.Address;

public class AddressDao implements DaoContract<Address, Integer> {

	@Override
	public List<Address> findAll() {
		List<Address> list = new LinkedList<>();
		Connection conn = null;
		try {
			conn = ConnectionUtil.getInstance().getConnection();
			String sql = "select * from address";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Address(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
			}
			conn.close();
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Address findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address delete(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address update(Address t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address insert(Address t) {
		// TODO Auto-generated method stub
		return null;
	}

}
