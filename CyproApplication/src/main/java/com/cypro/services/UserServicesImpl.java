package com.cypro.services;

import java.util.Optional;

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

	@Override
	public User logInUser(String email, String password) throws UserException {
		Optional<User> userOpt=userDao.findByEmail(email);
		if(userOpt.isEmpty()) throw new UserException("Invalid Email!");
		if(userOpt.get().getPassword().equals(password))return userOpt.get();
		else throw new UserException("Invalid Password!");	
	}
	
}
