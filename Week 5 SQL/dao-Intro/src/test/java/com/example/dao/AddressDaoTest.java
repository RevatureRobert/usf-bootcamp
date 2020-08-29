package com.example.dao;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.model.Address;

public class AddressDaoTest {

	AddressDao ad;
	
	@BeforeEach
	public void setup() {
		ad = new AddressDao();
	}
	
	@Test
	public void testFindAll() {
		List<Address> list = ad.findAll();
		assertNotNull(list);
		assertNotEquals(0, list.size());
		System.out.println(list);
	}
	
}
