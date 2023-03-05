package com.cypro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cypro.entity.User;
import com.cypro.exception.UserException;
import com.cypro.repository.UserDAO;

@Service
public class UserServicesImpl implements UserServices{
	private UserDAO userDao;

	@Autowired
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public User addUser(User user) throws UserException {
		return userDao.save(user);
	}
	
}
