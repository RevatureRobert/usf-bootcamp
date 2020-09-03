package com.legit.repo;

import java.util.List;

public interface DaoContract<T, I> {

	List<T> findAll();
	
	T findById(I i);
	
	int update(T t);
	
	int create(T t);
	
	T delete(I i);
}
