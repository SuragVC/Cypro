package com.cypro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cypro.entity.Purchase;

public interface PurchaseDAO extends JpaRepository<Purchase, Integer>{

}
