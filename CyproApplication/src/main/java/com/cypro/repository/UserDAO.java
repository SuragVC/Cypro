package com.cypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.User;

public interface UserDAO extends JpaRepository<User, Long>{

}
