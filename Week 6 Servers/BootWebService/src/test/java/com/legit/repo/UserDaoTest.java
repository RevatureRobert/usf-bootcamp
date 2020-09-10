package com.legit.repo;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.legit.model.User;

public class UserDaoTest {
	private UserDao ud;
	
	@BeforeEach
	public void setup() {
		ud=new UserDao();
	}
	
	//We need to test the insert statement, but the username has a unique constraint. So
	//	we just need something that will continue to pass for us.
	@Test
	public void InsertTest() {
		User user = new User(0, LocalDateTime.now().toString(), "williams");
		int in = ud.create(user);
		assertTrue(in>0);
	}
	
	@Test
	public void findAllTest() {
		List<User> users = ud.findAll();
		assertNotNull(users);
		assertNotEquals(0, users.size());
		System.out.println(users);
	}
}
