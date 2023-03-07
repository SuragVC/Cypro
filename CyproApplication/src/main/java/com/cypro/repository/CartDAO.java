package com.cypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Cart;

public interface CartDAO extends JpaRepository<Cart, Integer>{

}
