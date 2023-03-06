package com.cypro.services;

import com.cypro.entity.Customer;
import com.cypro.exception.UserException;

public interface UserServices {
	public Customer addUser(Customer user)throws UserException;
	public Customer logInUser(String email,String password)throws UserException;
}
