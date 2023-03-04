package com.cypro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Customer;



public interface CustomerDAO extends JpaRepository<Customer, Long>{
	
	Optional<Customer> findByEmail(String email);
	
	Optional<Customer>  findByMobileNo(String mobileNo);
}
