package com.camp.dao;

import java.util.List;

public interface DaoContract<T, I> {

	List<T> findAll();

	T findById(I id);

	int update(T t);

	int delete(I id);

	T insert(T t);
}
