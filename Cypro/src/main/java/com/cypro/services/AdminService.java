package com.cypro.services;

import java.util.List;

import com.cypro.entity.Admin;
import com.cypro.entity.Customer;
import com.cypro.exceptions.AdminException;
import com.cypro.exceptions.CustomerException;
import com.cypro.payloads.Message;

public interface AdminService {
	
	public Message registerAdmin(Admin admin) throws AdminException;
	
	public Message loginAdmin(String username,String password) throws AdminException;
	
	public Message deleteAdmin(String username,String password) throws AdminException;
	
	public Message updateAdmin(Admin admin) throws AdminException;
	
	public List<Customer> getAllCustomers() throws CustomerException;
	
	public Customer getCustomerDetailsById(Long userId) throws CustomerException;

}
