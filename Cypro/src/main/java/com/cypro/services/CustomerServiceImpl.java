package com.cypro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cypro.entity.Customer;
import com.cypro.exceptions.CustomerException;
import com.cypro.payloads.Message;
import com.cypro.repository.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDAO customerDao;
		
	@Autowired
	PasswordEncoder encoder;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {

		if(customer == null) throw new CustomerException("Enter Valid Customer....!");
		Optional<Customer> customerOpt = customerDao.findByEmail(customer.getEmail());
		if(customerOpt.isPresent())
			throw new CustomerException("Account already registred with this email! Try another");
		customer.setPassword(encoder.encode(customer.getPassword()));
		customer.setRole("USER");
		return customerDao.save(customer);
	}

	@Override
	public Message updateCustomer(Customer customer) throws CustomerException {

		if(customer == null) throw new CustomerException("Enter Valid Customer....!");
		
		Optional<Customer> opt = customerDao.findByEmail(customer.getEmail());
		
		if(opt.isEmpty()) throw new CustomerException("Enter Valid Email...!");
		
		if(opt.get().getPassword().equals(customer.getPassword()))
				customerDao.save(customer);
		else
			throw new CustomerException("Enter Valid User Password...!");
		
		return new Message("Updated Sucessfully with Id "+opt.get().getCustomerId());

	}

	@Override
	public Message deleteCustomer(String username, String password) throws CustomerException {
	
		Optional<Customer> opt = customerDao.findByEmail(username);
		
		if(opt.isEmpty()) throw new CustomerException("Enter Valid Email...!");
		
		if(opt.get().getPassword().equals(password))
			customerDao.deleteById(opt.get().getCustomerId());
		else
			throw new CustomerException("Enter Valid User Password...!");
		
		return new Message("Delete Sucessfully with Id "+opt.get().getCustomerId());
	}

	@Override
	public Message loginCustomer(String username, String password) throws CustomerException {

		Optional<Customer> opt = customerDao.findByEmail(username);
		
		if(opt.isEmpty()) throw new CustomerException("Enter Valid Email...!");
		
		if(opt.get().getPassword().equals(password))
			return new Message("Customer Login Sucessfully....!");
		else
			throw new CustomerException("Enter Valid User Password...!");
	}

	

	

}