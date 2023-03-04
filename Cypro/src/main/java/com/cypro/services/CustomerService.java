package com.cypro.services;

import com.cypro.entity.Customer;
import com.cypro.exceptions.CustomerException;
import com.cypro.payloads.Message;

public interface CustomerService {
	
	public Customer registerCustomer(Customer customer) throws CustomerException;
	
	public Message updateCustomer(Customer customer) throws CustomerException;
	
	public Message deleteCustomer(String username,String password) throws CustomerException;
	
	public Message loginCustomer(String username,String password) throws CustomerException;

	
}
