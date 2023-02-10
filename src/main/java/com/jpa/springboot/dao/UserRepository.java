package com.jpa.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.springboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	// Custom finder Methods
	
	public List<User> findByName(String name);
	
	// JPQL 
	
	@Query("select u from User u")
	public List<User> getAllUser();
	
	@Query("select u from User u where u.name =: n")
	public List<User> getUserByName(@Param("n") String name);
	
	// Firing Native query
	
	@Query(value="Select * from user", nativeQuery = true)
	public List<User> getUser();

}
