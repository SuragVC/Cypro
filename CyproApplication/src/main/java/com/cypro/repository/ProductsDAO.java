package com.cypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Product;

public interface ProductsDAO extends JpaRepository<Product, Integer>{

}
