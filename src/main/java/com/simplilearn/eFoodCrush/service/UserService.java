package com.simplilearn.eFoodCrush.service;

import java.io.IOException;

import com.simplilearn.eFoodCrush.entity.User;
import com.simplilearn.eFoodCrush.exception.EmailExistException;
import com.simplilearn.eFoodCrush.exception.UserNotFoundException;
import com.simplilearn.eFoodCrush.exception.UsernameExistException;

public interface UserService {
	User register(User user) throws UserNotFoundException, UsernameExistException, EmailExistException;

	User findUserByUsername(String username);

	User findUserByEmailId(String emailId);

	User addNewUser(User user) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException;

	void deleteUser(int id) throws UserNotFoundException;
}
