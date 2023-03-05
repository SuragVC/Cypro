package com.cypro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.User;

public interface UserDAO extends JpaRepository<User, Long>{
	Optional<User> findByEmail(String email);
}
