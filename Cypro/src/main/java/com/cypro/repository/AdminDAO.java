package com.cypro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Admin;

public interface AdminDAO extends JpaRepository<Admin, Long>{
	
	Optional<Admin> findByEmail(String email);

}
