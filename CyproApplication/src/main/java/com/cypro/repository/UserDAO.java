package com.cypro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Customer;

public interface UserDAO extends JpaRepository<Customer, Integer>{
	Optional<Customer> findByEmail(String email);
}
