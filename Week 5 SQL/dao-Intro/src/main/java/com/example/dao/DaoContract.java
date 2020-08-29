package com.example.dao;

import java.util.List;

/**
 * Instances of this type will access the database and 
 * perform operations according to sql standards.
 * @author Robert
 *
 * @param <T> The class to map to a database table
 * @param <I> The data type of the unique identifier 
 * associated with the class
 */
public interface DaoContract<T, I> {

	/**
	 * Returns a list of all instances in the db table.
	 * @return List of T
	 */
	List<T> findAll();

	/**
	 * Returns an instance of the class stored in the db
	 * @param i The object's unique identifier
	 * @return An instance of the class
	 */
	T findById(I i);

	/**
	 * Will delete a record in the db table
	 * @param i The object's unique identifier
	 * @return The object that was deleted
	 */
	T delete(I i);

	/**
	 * Updates a record in the db with the same unique identifier 
	 * as the object taken in.
	 * @param t The object to update the db record with.
	 * @return The updated object
	 */
	T update(T t);

	/**
	 * Create a record in the db table for the object taken in.
	 * @param t The object to store in the db table.
	 * @return The created object
	 */
	T insert(T t);

}
