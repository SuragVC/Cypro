package com.cypro.services;

import com.cypro.entity.User;
import com.cypro.exception.UserException;

public interface UserServices {
	public User addUser(User user)throws UserException;
}
