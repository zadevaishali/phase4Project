package com.simplilearn.eFoodCrush.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.eFoodCrush.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmailId(String emailId);
	public User findByUsername(String username);
	
}
